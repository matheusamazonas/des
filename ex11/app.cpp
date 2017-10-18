#include "app.h"

int32_t FONT_WIDTH, FONT_HEIGHT;

// Speed settings
uint32_t
	DRIVE_SPEED = 30,
	SPECIAL_SPEED = 15,
	MAX_ROT_DUR = 3780,
	MIN_ROT_DUR = 630,
	REVERSE_DUR = 1000,
	SENSOR_REFRESH_RATE = 50;

// Sensor mapping
sensor_port_t
  TLEFT_P = EV3_PORT_1, 
  COLOR_P = EV3_PORT_2, 
  ULTRA_P = EV3_PORT_3,
  TRIGHT_P = EV3_PORT_4;
    
// Motor mapping
motor_port_t
	LEFT_P = EV3_PORT_A,
	RIGHT_P = EV3_PORT_D;

bool_t
	touch_left = false,
	touch_right = false,
	do_exit = false;
colorid_t color;
int16_t ultrasonic = 0;

void set_font(lcdfont_t font) 
{
	ev3_lcd_set_font(font);
	ev3_font_get_size(font, &FONT_WIDTH, &FONT_HEIGHT);
}

void wait_for_white()
{
	ev3_motor_stop(LEFT_P, true);
	ev3_motor_stop(RIGHT_P, true);
	while(color != COLOR_WHITE) 
	{
		read_sensors(1);
	}
}

void wait_for_ultra()
{
	while (ev3_ultrasonic_sensor_get_distance(ULTRA_P) <= 0)
	{
		read_sensors(1);
	}
}

void reverse()
{
	ev3_motor_set_power(LEFT_P, -SPECIAL_SPEED);
	ev3_motor_set_power(RIGHT_P, -SPECIAL_SPEED);

	sleep(REVERSE_DUR);
}

void rotate_in_axis(int direction)
{
	uint32_t rot_dur = (rand()%(MAX_ROT_DUR - MIN_ROT_DUR) + MIN_ROT_DUR);
	ulong_t current_time = 0L, init_time;
	
	ev3_motor_set_power(LEFT_P, direction*SPECIAL_SPEED);
	ev3_motor_set_power(RIGHT_P, (-direction)*SPECIAL_SPEED);
	
	get_tim(&init_time);

	while (init_time + rot_dur > current_time)
	{
		check_for_obstacles();
		sleep(100);
		get_tim(&current_time);
	}
}

void move_towards()
{
	ev3_motor_set_power(LEFT_P, DRIVE_SPEED);
	ev3_motor_set_power(RIGHT_P, DRIVE_SPEED);
}

void avoid(int direction)
{
	ev3_led_set_color(LED_RED);
	ev3_speaker_play_tone(NOTE_A4, -1);
	reverse();
	rotate_in_axis(direction);
	ev3_led_set_color(LED_GREEN);
	ev3_speaker_stop();
}

void check_for_obstacles()
{
	read_sensors(1);
	if (color == COLOR_BLACK)
	{
		if (rand() % 2)
		{
			avoid(1);
		}
		else
		{
			avoid(-1);
		}
	}
	else if (touch_left)
	{
		avoid(1);
	}
	else if (touch_right)
	{
		avoid(-1);
	}
	else if (ultrasonic <= 22)
	{
		if (rand() % 2)
		{
			avoid(1);
		}
		else
		{
			avoid(-1);
		}
	}
}

void main_task(intptr_t unused) 
{
	init();
	ev3_led_set_color(LED_ORANGE);
	wait_for_white();
	wait_for_ultra();
	ev3_led_set_color(LED_GREEN);
	while(true) 
	{
		check_for_obstacles();
	    move_towards();
	    sleep(SENSOR_REFRESH_RATE);
	    if(do_exit)
	    {
	    	break;
	    }
	}
	// stop and close
	ev3_motor_stop(LEFT_P, true);
	ev3_motor_stop(RIGHT_P, true);
	ev3_lcd_clear_line(5);
	ev3_print(5, "Finished!");
}

void init() 
{
	ulong_t time;
	set_font(EV3_FONT_MEDIUM);
	//	Motor init
	ev3_motor_config(LEFT_P, LARGE_MOTOR);
	ev3_motor_config(RIGHT_P, LARGE_MOTOR);
	//	Sensor init
	ev3_sensor_config(ULTRA_P, ULTRASONIC_SENSOR);
	ev3_sensor_config(COLOR_P, COLOR_SENSOR);
	ev3_sensor_config(TLEFT_P, TOUCH_SENSOR);
	ev3_sensor_config(TRIGHT_P, TOUCH_SENSOR);
	//	Attach exit handler
	ev3_button_set_on_clicked(ENTER_BUTTON, close_app, ENTER_BUTTON);
	// Initialize the random generator
	get_tim(&time);
	srand(time);
}

void read_sensors(int display_line) 
{
	touch_left = ev3_touch_sensor_is_pressed(TLEFT_P);
	touch_right = ev3_touch_sensor_is_pressed(TRIGHT_P);
	color = ev3_color_sensor_get_color(COLOR_P);
	ultrasonic = ev3_ultrasonic_sensor_get_distance(ULTRA_P);
	if (display_line >= 0)
	{
		print_sensor_values(display_line);
	}
}

void print_sensor_values(int start_line) 
{
	char str[100];

	ev3_lcd_clear_line_range(start_line, start_line + 5);
	snprintf(str, 100, "TouchL: %d", touch_left);
	ev3_print(start_line + 0, str);
	snprintf(str, 100, "TouchR: %d", touch_right);
	ev3_print(start_line + 1, str);
	snprintf(str, 100, "Ultra : %d", ultrasonic);
	ev3_print(start_line + 2, str);
	snprintf(str, 100, "Color : %d", color);
	ev3_print(start_line + 3, str);
}

void close_app(intptr_t btn) 
{
	do_exit = true;
	ev3_print(5, "Finishing..");
}
