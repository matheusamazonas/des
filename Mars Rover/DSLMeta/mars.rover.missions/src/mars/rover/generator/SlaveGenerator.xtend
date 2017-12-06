package mars.rover.generator

import mars.rover.missionsDSL.Robot

class SlaveGenerator {
	def static toCpp(Robot robot)'''
	#include "common.h"
	#include "app.h"
	
	//static FILE *bt_con;	
	
	// Sensor mapping
	sensor_port_t
	TOUCH_L_P = EV3_PORT_1, 
	COLOR_M_P = EV3_PORT_2, 
	ULTRA_FRONT_P = EV3_PORT_3,
	TOUCH_R_P = EV3_PORT_4;
	
	bool_t touch_l, touch_r;
	colorid_t color_m;
	int16_t ultra_front_dist = 0;
	
	void read_sensors(int display_line) 
	{
		color_m = ev3_color_sensor_get_color(COLOR_M_P);
		touch_l = ev3_touch_sensor_is_pressed(TOUCH_L_P);
		touch_r = ev3_touch_sensor_is_pressed(TOUCH_R_P);
		ultra_front_dist = ev3_ultrasonic_sensor_get_distance(ULTRA_FRONT_P);
	}
	
	void wait_for_black()
	{
		while(color_m != COLOR_BLACK) 
		{
			read_sensors(1);
		}
		cycle_print((char*)"Ready");
	}
	
	void wait_for_ultra()
	{
		while (ev3_ultrasonic_sensor_get_distance(ULTRA_FRONT_P) <= 0)
		{
			read_sensors(1);
		}
	}
	
	void init()
	{
		cycle_print((char*)"Slave");
		
		//	Sensor init
		ev3_sensor_config(ULTRA_FRONT_P, ULTRASONIC_SENSOR);
		ev3_sensor_config(COLOR_M_P, COLOR_SENSOR);
		ev3_sensor_config(TOUCH_L_P, TOUCH_SENSOR);
		ev3_sensor_config(TOUCH_R_P, TOUCH_SENSOR);
		
		ev3_led_set_color(LED_ORANGE);
		wait_for_black();
		wait_for_ultra();
		ev3_led_set_color(LED_GREEN);
	}

	void main_task(intptr_t unused) 
	{
		setup();
		init();
		act_tsk(ACT_TASK);
	}
	
	void sense_task(intptr_t unused) 
	{
	
	}
	
	void act_task(intptr_t unused) 
	{
		
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