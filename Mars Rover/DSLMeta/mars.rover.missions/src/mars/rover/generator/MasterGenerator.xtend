package mars.rover.generator

import mars.rover.missionsDSL.Robot
import mars.rover.missionsDSL.Mission


class MasterGenerator {
	
	def static getMacCode(String address){
		var String[] parts = address.split(":");
		return "{0x" + parts.get(0) + ", " +
			    "0x" + parts.get(1) + ", " +
			    "0x" + parts.get(2) + ", " +
			    "0x" + parts.get(3) + ", " +
			    "0x" + parts.get(4) + ", " +
			    "0x" + parts.get(5) + "}"
	}
	
	def static toCpp(Robot robot)'''
	#include "common.h"
	#include "app.h"
	
	#define BT_CONNECT_PERIOD 100
	
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
	const uint8_t slave_address[6] = «getMacCode(robot.slaveAddress)»;
	const char* pin = "0000";
	
	
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
	void rotate_with_params(int16_t dir, colorid_t targetColor);
	void adjust_for_measurement(colorid_t targetColor);
	
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
			bt_con = fdopen(SIO_PORT_SPP_MASTER_TEST_FILENO, "wb+");
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
		cycle_print((char*)"Connected to slave.");
		act_tsk(SENSE_TASK);
	}
	
	colorid_t parseIntToColor(int n)
	{
		switch(n)
		{
			case 1 :{
				return COLOR_BLACK;
			}
			case 2 :{
				return COLOR_BLUE;
			}
			case 3 :{
				return COLOR_GREEN;
			}
			case 4 :{
				return COLOR_YELLOW;
			}
			case 5 :{
				return COLOR_RED;
			}
			case 6 :{
				return COLOR_WHITE;
			}
			case 7 :{
				return COLOR_BROWN;
			}
			case 0 :{
				return COLOR_WHITE;
			}
		}
		return COLOR_NONE;
	}
	
	void parseStringToVar(char* arr )
	{
		int count = 0;
	
		const char s[2] = ",";
		char *token;
		
		token = strtok(arr, s);
		ultra_front_dist = atoi(token);
		while( token != NULL) 
		{
			token = strtok(NULL,s);
			if(count == 0)
			{
				touch_l = atoi(token);
			}
			else
			{
				if(count == 1)
				{
					touch_r = atoi(token);
				}
				else
				{
					if(count == 2)
					{
						color_m = parseIntToColor(atoi(token));
					}
				}
			}
		count++;
		}
	}
	
	void update_slave_sensors()
	{
		while(true)
		{
			char arr1[30];
			fgets(arr1, 30, bt_con);
			parseStringToVar(arr1);
			sprintf(arr1, "update slave %d %d %d %d sl", ultra_front_dist, touch_l, touch_r, color_m);
			cycle_print(arr1);
		}
	}
	
	void read_sensors() 
	{
		char arr1[30];
		dly_tsk(SENSOR_REFRESH_RATE); 
		sprintf(arr1, "Obtained : %d %d %d %d %d . %d %d", ultra_front_dist, ultra_back_dist, touch_l, touch_r,  color_m, color_l, color_r);
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
		while(color_r != COLOR_BLACK && color_l != COLOR_BLACK && color_m != COLOR_BLACK)  
		{
			read_sensors();
		}
		cycle_print((char*)"Ready");
	}
	
	void wait_for_ultra()
	{
		while (ultra_back_dist <= 0 || ultra_front_dist <= 0)
		{
			read_sensors();
		}
	}
	
	void stop()
	{
		ev3_motor_stop(WHEEL_LEFT_P, true);
		ev3_motor_stop(WHEEL_RIGHT_P, true);
	}
	
	void measure()
	{
		ulong_t current_time = 0L, init_time;
		stop();
		ev3_motor_set_power(SMALL_ARM_P, -7);
		
		get_tim(&init_time);
		while (init_time + 1000 > current_time)
		{
			read_sensors();
			get_tim(&current_time);
		}
		ev3_motor_set_power(SMALL_ARM_P, 7);
		
		get_tim(&init_time);
		while (init_time + 1000 > current_time)
		{
			read_sensors();
			get_tim(&current_time);
		}
	}
	
	void move_towards()
	{
		ev3_motor_set_power(WHEEL_LEFT_P, DRIVE_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, DRIVE_SPEED);
	}
	
	void move_for(uint32_t duration)
	{
		ulong_t current_time = 0L, init_time;
		
		ev3_motor_set_power(WHEEL_LEFT_P, SPECIAL_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, SPECIAL_SPEED);
		
		get_tim(&init_time);
		
		while (init_time + duration > current_time)
		{
			read_sensors();
			get_tim(&current_time);
		}
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
			get_tim(&current_time);
		}
	}
	
	
	void rotate_with_params(int16_t dir, colorid_t targetColor)
	{
		ev3_gyro_sensor_reset(GYRO_P);
		//read_sensors();
		ev3_motor_set_power(WHEEL_LEFT_P, dir*SPECIAL_SPEED);
		ev3_motor_set_power(WHEEL_RIGHT_P, (-dir)*SPECIAL_SPEED);
		if(dir == 1)
		{
			while ( (color_m != targetColor || color_r == targetColor ||  color_r == COLOR_NONE)  )
			{
				if(color_m == COLOR_NONE)
				{
					cycle_print((char*)"....REVERSE MID=NONE");
					reverse(200);
				}
				read_sensors();
			}
		}
		else
		{
			while ( (color_m != targetColor || color_l == targetColor ||  color_l == COLOR_NONE)  )
			{
				if(color_m == COLOR_NONE)
				{
					cycle_print((char*)"....REVERSE MID=NONE");
					reverse(200);
				}
				read_sensors();
			}
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
		«FOR Mission m : robot.startMissions.sortBy[priority].reverse SEPARATOR " else "»
		«MissionGenerator.getMissionCode(m)»
		«ENDFOR»
	}
	
	void adjust_for_measurement(colorid_t targetColor)
	{
		ulong_t current_time = 0L, init_time;
		if(color_m ==  targetColor && color_l ==  targetColor && color_r !=  targetColor)
		{
			//rotateLeft
			cycle_print((char*)"....MID and LEFT");
			reverse(200);
			rotate_with_params(-1, targetColor);
			
		}
		else
		{
			if(color_m ==  targetColor && color_l !=  targetColor && color_r ==  targetColor)
			{
				//rotateRight
				cycle_print((char*)"....MID and RIGHT");
				reverse(200);
				rotate_with_params( 1, targetColor);
				
			}
			else
			{
				if(color_m !=  targetColor && color_l !=  targetColor && color_r ==  targetColor)
				{
					//rotateRight
					cycle_print((char*)".... RIGHT");
					move_towards();
					get_tim(&init_time);
					while (init_time + 375 > current_time)
					{
						read_sensors();
						
						if(color_m == targetColor)
						{
							break;
						}
						get_tim(&current_time);
					}
																
					rotate_with_params(1, targetColor);
					cycle_print((char*)"....DONE_WITH_ADJUST");
					
				}
				else
				{
					if(color_m !=  targetColor && color_l ==  targetColor && color_r !=  targetColor)
					{
						move_towards();
						cycle_print((char*)".... LEFT");
						get_tim(&init_time);
						while (init_time + 375 > current_time)
						{
							read_sensors();
						
							if(color_m ==  targetColor)
							{
								break;
							}
							get_tim(&current_time);
						}
						rotate_with_params(-1, targetColor);
					}
				}
			}
		}
	}
	
	void main_task(intptr_t unused) 
	{
		setup();
		connect_to_slave();
		init();
		//initiated right after bt connection is concluded. in connect_to_slave
		act_tsk(ACT_TASK);
	}
	
	// The sense task is initializated in connect_to_slave, after the BT connection is stablished
	void sense_task(intptr_t unused) 
	{
		cycle_print((char*)"SENSE HAS STARTED");
		update_slave_sensors();
	}
	
	void act_task(intptr_t unused) 
	{
		«IF robot.startMissions.length > 0»
		while(true) 
		{
			read_sensors();
			check_for_conditions();
		    move_towards();
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