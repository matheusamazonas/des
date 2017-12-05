package mars.rover.generator

import mars.rover.missionsDSL.Robot

class MasterGenerator {
	def static toCpp(Robot robot)'''
	#include "common.h"
	#include "app.h"
	
	//static FILE *bt_con;	
	
	void init()
	{
		cycle_print((char*)"Slave");
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