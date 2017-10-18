#include "movement.h"

int32_t NLINES;
uint8_t slave_address[6] = { 0x00, 0x17, 0xE9, 0xB2, 0x56, 0x99 };
const char* pin = "0000";
static FILE *bt_con;
int line = 0;

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

void slave_task(intptr_t unused)
{
	connect_to_master();
	movement_task(unused);
}
void master_task(intptr_t unused)
{
	connect_to_slave();
	movement_task(unused);
}

void main_task(intptr_t unused) 
{
	if (is_master)
	{
		master_task(unused);
	}
	else
	{
		slave_task(unused);
	}
}




