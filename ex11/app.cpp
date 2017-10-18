#include "movement.h"

int32_t NLINES;
const uint8_t slave_address[6] = { 0x00, 0x17, 0xE9, 0xB2, 0x56, 0x99 };
const char* pin = "0000";
static FILE *bt_con;
int line = 0;
int* colors;

bool_t isConnected()
{
	T_SERIAL_RPOR rpor;
    ER ercd = serial_ref_por(SIO_PORT_SPP_MASTER_TEST, &rpor);
    return ercd == E_OK;
}

void cycle_print(char* message) 
{
    int printLine = ++line % NLINES;
    if (line >= NLINES)
    {
        ev3_lcd_clear_line_range(printLine, printLine + 1);
    }
    ev3_print(printLine, message);
}

void connect_to_slave()
{
	while(true)
	{
		bt_con = fdopen(SIO_PORT_SPP_MASTER_TEST_FILENO, "a+");
	    if (bt_con != NULL) 
	    {
	        setbuf(bt_con, NULL);
	        while (!isConnected()) 
	        {
	        	cycle_print((char*)"Trying to connect...");
	            spp_master_test_connect(slave_address, pin);
	            sleep(1000);
	        }
	        break;
	    }
	}
	fprintf(bt_con, "000\n");
	cycle_print((char*)"Connected to slave.");
}

void connect_to_master()
{
	while(true)
	{
		while (!ev3_bluetooth_is_connected()) 
		{
		    cycle_print((char*)"Waiting for connection...");
		    sleep(1000);
		}
		bt_con = ev3_serial_open_file(EV3_SERIAL_BT);
		break;
	}

	cycle_print((char*)"Connected to master.");
}

void process_colors(char buf[])
{
	int i;
	bool allTrue = true;
	for (i = 0; i < 3; i++)
	{
		colors[i] = (buf[i] - '0') || colors[i];
	}
	for (i = 0; i < 3; i++)
	{
		allTrue = colors[i] && allTrue;
	}
	if (allTrue)
	{
		cycle_print((char*)"DONEEEEEEEEEEEEE.");
	}
}

void communicate_color_master()
{
	//static char buf[8];
	cycle_print((char*)"Trying to send colors...");
	fprintf(bt_con, "%d%d%d\n", colors[0], colors[1], colors[2]);
	cycle_print((char*)"Sent colors...");
	static char buf[8];
	while (fgets(buf, 8, bt_con)) 
	{
		cycle_print(buf);
		process_colors(buf);
		dly_tsk(500);
	}
}

void communicate_color_slave()
{
	static char buf[8];
	while (fgets(buf, 8, bt_con)) 
	{
		cycle_print(buf);
		process_colors(buf);
		dly_tsk(500);
	}
}

void move_task(intptr_t unused)
{
	move(colors);
}

void color_task(intptr_t unused)
{
	if (is_master)
	{
		communicate_color_master();
	}
	else
	{
		communicate_color_slave();
	}
}

void main_task(intptr_t unused) 
{
	colors = (int*) calloc(3, sizeof(int));
	if (is_master)
	{
		connect_to_slave();
	}
	else
	{
		connect_to_master();
	}
	act_tsk(MOVE_TASK);
	act_tsk(COLOR_TASK);
}




