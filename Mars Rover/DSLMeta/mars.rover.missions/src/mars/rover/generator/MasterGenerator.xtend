package mars.rover.generator

import mars.rover.missionsDSL.Robot
import mars.rover.missionsDSL.Mission

class MasterGenerator {
	
	
	def static toCpp(Robot robot)'''
	#include "common.h"
	#include "app.h"
	
	#define BT_CONNECT_PERIOD 200
	
	static FILE *bt_con;	
	
	// Settings
	const uint32_t
		DRIVE_SPEED = «robot.defaultSpeed»,
		SPECIAL_SPEED = «robot.slowSpeed»,
		SENSOR_REFRESH_RATE = «IF robot.refreshRate !== null»«robot.refreshRate.value»«ELSE»100«ENDIF»,
		BEEP_DURATION = 10;
	const int16_t
		MAX_ROT_ANGLE = «robot.maxAngle»,
		MIN_ROT_ANGLE = «robot.minAngle»;
	
	
	// Sensor mapping
	const sensor_port_t
	COLOR_L_P = EV3_PORT_1, 
	ULTRA_BACK_P = EV3_PORT_2, 
	GYRO_P = EV3_PORT_3,
	COLOR_R_P = EV3_PORT_4;
	
	// Motor mapping
	const motor_port_t
	WHEEL_LEFT_P = EV3_PORT_A,
	SMALL_ARM_P = EV3_PORT_C,
	WHEEL_RIGHT_P = EV3_PORT_D;
	
	// Sensors states
	colorid_t color_r, color_l;
	int16_t ultra_back_dist, gyro_angle;
	
	//slave sensors
	bool_t touch_l, touch_r;
	colorid_t color_m;
	int16_t ultra_front_dist;
	
	// Mission condition variables
	«FOR Mission mission : robot.availableMissions»
	«MissionGenerator.getGlobals(mission)»
	«ENDFOR»
	
	void check_for_conditions();
	
		
	void connect_to_slave()
	{
		while(true)
			{
				while (!ev3_bluetooth_is_connected()) 
				{
				    cycle_print((char*)"Waiting for connection...");
				    sleep(BT_CONNECT_PERIOD);
				}
				bt_con = ev3_serial_open_file(EV3_SERIAL_BT);
				//setbuf(bt_con, NULL);
				break;
			}
			
			cycle_print((char*)"Connected to slave.");
	}
	
	colorid_t convertCharColorValue(char c){
	
	
	
		switch((c-'0')){	
			case(0):
				return COLOR_NONE;
			case(1):
				return COLOR_BLACK;
			case(2):
				return COLOR_BLUE;
			case(3):
				return COLOR_GREEN;
			case(4):
				return COLOR_YELLOW;
			case(5):
				return COLOR_RED;
			case(6):
				return COLOR_WHITE;	
			case(7):
				return COLOR_BROWN;
			default:
				return COLOR_NONE;
				
		}
	
	
	}
	
	void update_slave_sensors(){
		int auxColor=0;
		fread(&ultra_front_dist, sizeof(int16_t), 1, bt_con);
		fread(&touch_l, sizeof(bool_t), 1, bt_con);
		fread(&touch_r, sizeof(bool_t), 1, bt_con);
		fread(&color_m, sizeof(colorid_t), 1, bt_con);
		
	}
	
	void read_sensors() 
	{
		update_slave_sensors();
		char arr1[30]; 
		sprintf(arr1, "Obtained : %d %d %d %d", ultra_front_dist, touch_l, touch_r,  color_m);
		cycle_print(arr1);
		color_l = ev3_color_sensor_get_color(COLOR_L_P);
		color_r = ev3_color_sensor_get_color(COLOR_R_P);
		ultra_back_dist = ev3_ultrasonic_sensor_get_distance(ULTRA_BACK_P);
		gyro_angle = ev3_gyro_sensor_get_angle(GYRO_P);
		
		
	}
	
	void wait_for_black()
	{
		ev3_motor_stop(WHEEL_LEFT_P, true);
		ev3_motor_stop(WHEEL_RIGHT_P, true);
		while(color_r != COLOR_BLACK && color_l != COLOR_BLACK) 
		{
			read_sensors();
			//sleep(100);
		}
		cycle_print((char*)"Ready");
	}
	
	void wait_for_ultra()
	{
		while (ev3_ultrasonic_sensor_get_distance(ULTRA_BACK_P) <= 0)
		{
			read_sensors();
			//sleep(100);
		}
	}
	
	void stop()
		{
			ev3_motor_stop(WHEEL_LEFT_P, true);
			ev3_motor_stop(WHEEL_RIGHT_P, true);
		}
	
		
	
	void move_towards()
	{
		ev3_motor_set_power(WHEEL_LEFT_P, DRIVE_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, DRIVE_SPEED);
	}
	
	void reverse(uint32_t duration)
	{
		ulong_t current_time = 0L, init_time;
	
		ev3_motor_set_power(WHEEL_LEFT_P, -SPECIAL_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, -SPECIAL_SPEED);
	
		get_tim(&init_time);
	
		while (init_time + duration > current_time)
		{
			read_sensors();
			//check_colors();
			//sleep(100);
			get_tim(&current_time);
		}
	}
	
	
	void rotate()
	{
		int rand_direc = rand() % 2 == 0 ? 1 : -1;
		int16_t rot_angle = (rand()%(MAX_ROT_ANGLE - MIN_ROT_ANGLE) + MIN_ROT_ANGLE);
		
		ev3_gyro_sensor_reset(GYRO_P);
		//sleep(100);
		read_sensors();
		
		ev3_motor_set_power(WHEEL_LEFT_P, rand_direc*SPECIAL_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, (-rand_direc)*SPECIAL_SPEED);
	
		while (abs(gyro_angle) < rot_angle)
		{
			//check_for_conditions();
			read_sensors();
			//sleep(100);
		}
	}
	
	void halt()
	{
		cycle_print((char*)"Halt...");
		stop();
		ev3_led_set_color(LED_OFF);
		fclose(bt_con);
		ext_tsk();
	}
	
	void close_app_handler(intptr_t unused) 
	{
		halt();
	}

	void init()
	{
		cycle_print((char*)"Master");
		
		// Attach exit handler
		ev3_button_set_on_clicked(BACK_BUTTON, close_app_handler, BACK_BUTTON);
		
		//	Motor init
		ev3_motor_config(WHEEL_LEFT_P, LARGE_MOTOR);
		ev3_motor_config(WHEEL_RIGHT_P, LARGE_MOTOR);
		ev3_motor_config(SMALL_ARM_P, MEDIUM_MOTOR);
		//	Sensor init
		ev3_sensor_config(ULTRA_BACK_P, ULTRASONIC_SENSOR);
		ev3_sensor_config(COLOR_R_P, COLOR_SENSOR);
		ev3_sensor_config(COLOR_L_P, COLOR_SENSOR);
		ev3_sensor_config(GYRO_P, GYRO_SENSOR);
		
		wait_for_black();
		wait_for_ultra();
		ev3_led_set_color(LED_GREEN);
	}
	
	void check_for_conditions()
	{
		// TODO: Sort missions based on priority
		«FOR Mission m : robot.startMissions SEPARATOR " else "»
		«MissionGenerator.getMissionCode(m)»
		«ENDFOR»
	}
	
	void main_task(intptr_t unused) 
	{
		setup();
		connect_to_slave();
		init();
		act_tsk(ACT_TASK);
		act_tsk(SENSE_TASK);
	}
	
	void sense_task(intptr_t unused) 
	{


	}
	
	void act_task(intptr_t unused) 
	{
		«IF robot.startMissions.length > 0»
		while(true) 
		{
			read_sensors();
			check_for_conditions();
		    move_towards();
		    sleep(SENSOR_REFRESH_RATE);
		}
		«ENDIF»
	}
	'''
	
	def static toHeader(Robot robot)'''
	#ifndef APP
	#define APP
	
	#ifdef __cplusplus
	extern "C" {
	#endif
	
	#pragma once
	
	#include "ev3api.h"
	
	#ifndef STACK_SIZE
	#define	STACK_SIZE 4096
	#endif
	
	extern void	main_task(intptr_t);
	extern void act_task(intptr_t);
	extern void sense_task(intptr_t);
	
	#ifdef __cplusplus
	}
	#endif
	
	#endif
	'''
}