// Matheus Andrade and Alan Andrade

#include "movement.h"
#include "roll.h"

#define DISCOVERY_DURATION 150
#define BT_CONNECT_PERIOD 500

const uint8_t slave_address[6] = { 0x00, 0x17, 0xE9, 0xB2, 0x56, 0x99 };
const char* pin = "0000";
static FILE *bt_con;
int32_t NLINES;
int line = 0;
int* colors = (int*) calloc(3, sizeof(int));


// ---------- BT Communication ----------

bool_t isConnected()
{
	T_SERIAL_RPOR rpor;
    ER ercd = serial_ref_por(SIO_PORT_SPP_MASTER_TEST, &rpor);
    return ercd == E_OK;
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
	            sleep(BT_CONNECT_PERIOD);
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
		    sleep(BT_CONNECT_PERIOD);
		}
		bt_con = ev3_serial_open_file(EV3_SERIAL_BT);
		break;
	}
	fprintf(bt_con, "000\n");
	cycle_print((char*)"Connected to master.");
}

// ---------- Color handling ----------

void write_colors()
{
	fprintf(bt_con, "%d%d%d\n", colors[0], colors[1], colors[2]);
}

bool is_done()
{
	int i;
	bool allTrue = true;
	for (i = 0; i < 3; i++)
	{
		allTrue = colors[i] && allTrue;
	}
	return allTrue;
}

void process_colors(char buf[])
{
	int i, x;
	for (i = 0; i < 3; i++)
	{
		x = buf[i] - '0';
		if (x != colors[i])
		{
			ev3_speaker_play_tone(NOTE_C4, DISCOVERY_DURATION);
			blink_led(LED_ORANGE, LED_GREEN, DISCOVERY_DURATION);
			cycle_print((char*)"Found a color!");
		}
		colors[i] |= x;
	}
	if (is_done())
	{
		write_colors();
		cycle_print((char*)"Found all colors!");
		close_app();
		if (is_master)
		{
			roll();
		}
	}
}

void communicate_color()
{
	static char buf[8];
	while (fgets(buf, 8, bt_con)) 
	{
		process_colors(buf);
		write_colors();
	}
}

// ---------- Closing and setting up ----------

void close_app_handler(intptr_t unused) 
{
	close_app();
}

void close_app()
{
	stop();
	fclose(bt_con);
	cycle_print((char*)"Closing...");
	ter_tsk(MOVE_TASK);
	ter_tsk(COLOR_TASK);
	ter_tsk(MAIN_TASK);
}

void setup()
{
    //	Attach exit handler
	ev3_button_set_on_clicked(ENTER_BUTTON, close_app_handler, ENTER_BUTTON);
	NLINES = EV3_LCD_HEIGHT / FONT_HEIGHT;
	init();
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

// ---------- Tasks ----------

void move_task(intptr_t unused)
{
	move(colors);
}

void color_task(intptr_t unused)
{
	communicate_color();
}

void main_task(intptr_t unused) 
{
	if (is_master)
	{
		connect_to_slave();
	}
	else
	{
		connect_to_master();
	}
	setup();
	act_tsk(MOVE_TASK);
	act_tsk(COLOR_TASK);
}
