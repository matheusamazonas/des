package mars.rover.generator

import mars.rover.missionsDSL.Robot
import mars.rover.missionsDSL.Mission

class MasterGenerator {
	def static toCpp(Robot robot)'''
	#include "common.h"
	#include "app.h"
	
	//static FILE *bt_con;	
	
	// Settings
	uint32_t
		DRIVE_SPEED = 30,
		SPECIAL_SPEED = 15,
		SENSOR_REFRESH_RATE = 50,
		BEEP_DURATION = 10;
	int16_t
		MAX_ROT_ANGLE = 270,
		MIN_ROT_ANGLE = 90;
	
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
	int16_t ultra_back_dist = 0;
	
	void check_for_conditions();
	
	void read_sensors(int display_line) 
	{
		color_l = ev3_color_sensor_get_color(COLOR_L_P);
		color_r = ev3_color_sensor_get_color(COLOR_R_P);
		ultra_back_dist = ev3_ultrasonic_sensor_get_distance(ULTRA_BACK_P);
	}
	
	void wait_for_black()
	{
		ev3_motor_stop(WHEEL_LEFT_P, true);
		ev3_motor_stop(WHEEL_RIGHT_P, true);
		while(color_r != COLOR_BLACK && color_l != COLOR_BLACK) 
		{
			read_sensors(1);
		}
		cycle_print((char*)"Ready");
	}
	
	void wait_for_ultra()
	{
		while (ev3_ultrasonic_sensor_get_distance(ULTRA_BACK_P) <= 0)
		{
			read_sensors(1);
		}
	}
	
	void blink_led(ledcolor_t color, ledcolor_t reset, float duration)
	{
		ev3_led_set_color(color);
		dly_tsk(duration);
		ev3_led_set_color(reset);
	}
	
	void stop()
	{
		// stop and close
		ev3_motor_stop(WHEEL_LEFT_P, true);
		ev3_motor_stop(WHEEL_RIGHT_P, true);
		ev3_led_set_color(LED_OFF);
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
			read_sensors(1);
			//check_colors();
			sleep(100);
			get_tim(&current_time);
		}
	}
	
	void rotate()
	{
		int rand_direc = rand() % 2;
		int16_t rot_angle = (rand()%(MAX_ROT_ANGLE - MIN_ROT_ANGLE) + MIN_ROT_ANGLE);
		ev3_gyro_sensor_reset(GYRO_P);
		int16_t current_angle = ev3_gyro_sensor_get_angle(GYRO_P);
		
		ev3_motor_set_power(WHEEL_LEFT_P, rand_direc*SPECIAL_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, (-rand_direc)*SPECIAL_SPEED);
	
		while (current_angle < rot_angle)
		{
			//check_for_conditions();
			sleep(100);
			current_angle = ev3_gyro_sensor_get_angle(GYRO_P);
		}
	}

	void init()
	{
		cycle_print((char*)"Master");
		
		//	Motor init
		ev3_motor_config(WHEEL_LEFT_P, LARGE_MOTOR);
		ev3_motor_config(WHEEL_RIGHT_P, LARGE_MOTOR);
		//	Sensor init
		ev3_sensor_config(ULTRA_BACK_P, ULTRASONIC_SENSOR);
		ev3_sensor_config(COLOR_R_P, COLOR_SENSOR);
		ev3_sensor_config(COLOR_L_P, COLOR_SENSOR);
		ev3_sensor_config(GYRO_P, GYRO_SENSOR);
		
		MIN_ROT_ANGLE = «robot.minAngle»;
		MAX_ROT_ANGLE = «robot.maxAngle»;
		
		DRIVE_SPEED = «robot.defaultSpeed»;
		SPECIAL_SPEED = «robot.slowSpeed»;
		
		ev3_led_set_color(LED_ORANGE);
		wait_for_black();
		wait_for_ultra();
		ev3_led_set_color(LED_GREEN);
	}
	
	void check_for_conditions()
	{
		// TODO: Sort missions based on priority
		«FOR Mission m : robot.missions SEPARATOR " else "»
		«MissionGenerator.getMissionCode(m)»
		«ENDFOR»
	}
	
	void halt()
	{
		// TODO: Clean halt. Close connection. Close app.
		stop();
		ter_tsk(ACT_TASK);
		ter_tsk(SENSE_TASK);
		ter_tsk(MAIN_TASK);
	}

	void main_task(intptr_t unused) 
	{
		setup();
		init();
		act_tsk(ACT_TASK);
		act_tsk(SENSE_TASK);
	}
	
	void sense_task(intptr_t unused) 
	{


	}
	
	void act_task(intptr_t unused) 
	{
		«IF robot.missions.length > 0»
		while(true) 
		{
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