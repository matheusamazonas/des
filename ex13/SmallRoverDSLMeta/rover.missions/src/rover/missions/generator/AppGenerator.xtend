package rover.missions.generator

import rover.missions.roverDSL.Robot

class AppGenerator {
	def static toCpp(Robot root)'''
		
		
		#include "«root.mission.id».h"
		
		int32_t NLINES;
		int line = 0;
		
		
		«IF root.mission.id == "FindColors"» int* colors = (int*) calloc(«root.mission.find.color.length», sizeof(int));«ENDIF»
		
		void cycle_print(char* message) 
		{
		    int printLine = ++line % NLINES;
		    if (line >= NLINES)
		    {
		        ev3_lcd_clear_line_range(printLine, printLine + 1);
		    }
		    ev3_print(printLine, message);
		}
		
		void move_task(intptr_t unused){
			move(«IF root.mission.id == "FindColors"»colors«ENDIF»);
		}
		
		void close_app_handler(intptr_t unused) 
		{
			close_app();
		}
		
		void close_app()
		{
			stop();
			cycle_print((char*)"Closing...");
			ter_tsk(MOVE_TASK);
		}
		
		void setup(){
					    //	Attach exit handler
						ev3_button_set_on_clicked(ENTER_BUTTON, close_app_handler, ENTER_BUTTON);
						NLINES = EV3_LCD_HEIGHT / FONT_HEIGHT;
						init();
					}
		
		void main_task(intptr_t unused) 
		{
			setup();
			act_tsk(MOVE_TASK);
		}

	'''
	
	def static toCfg(Robot root)'''
	INCLUDE("app_common.cfg");
	
	#include "app.h"
	
	
	DOMAIN(TDOM_APP) {
	CRE_TSK(MAIN_TASK, { TA_ACT, 0, main_task, TMIN_APP_TPRI, STACK_SIZE, NULL });
	CRE_TSK(MOVE_TASK, {TA_NULL, 0, move_task, TMIN_APP_TPRI+2, STACK_SIZE, NULL });
	
	}
	
	ATT_MOD("app.o");
	
	'''
	
	def static toH(Robot root)'''
	
	// Matheus Andrade and Alan Andrade
	
	#ifndef APP
	#define APP
	
	#ifdef __cplusplus
	extern "C" {
	#endif
	
	#define is_master true
	
	#pragma once
	
	#include "ev3api.h"
	
	#ifndef STACK_SIZE
	#define	STACK_SIZE		4096
	#endif
	
	#ifndef TOPPERS_MACRO_ONLY
	
	#include <stdio.h>
	#include <unistd.h>
	#include <ctype.h>
	#include <string.h>
	#include <stdlib.h>
	#include <time.h>
	#include <sys/time.h>
	#include "syssvc/serial.h"
	#include "driver_interface_bluetooth.h"
	#include "driver_interface_filesys.h"
	
	#define sleep tslp_tsk
	
	#define ev3_print(x, s) ev3_lcd_draw_string(s, 0, x * FONT_HEIGHT)
	
	#define ev3_lcd_clear() ev3_lcd_fill_rect(0, 0, EV3_LCD_WIDTH, EV3_LCD_HEIGHT, EV3_LCD_WHITE)
	#define ev3_lcd_clear_line(x) ev3_lcd_fill_rect(0, x * FONT_HEIGHT, EV3_LCD_WIDTH, FONT_HEIGHT, EV3_LCD_WHITE)
	#define ev3_lcd_clear_line_range(x, y) ev3_lcd_fill_rect(0, x * FONT_HEIGHT, EV3_LCD_WIDTH, (y - x) * FONT_HEIGHT, EV3_LCD_WHITE)
	
	/**
	 * Default font
	 */
	extern int32_t FONT_WIDTH;
	extern int32_t FONT_HEIGHT;
	
	/**
	 * Functions
	 */
	
	extern void set_font(lcdfont_t);
	extern void init();
	extern void read_sensors(int);
	extern void close_app();
	void cycle_print(char*); 
	/**
	 * Tasks
	 */
	
	extern void	main_task(intptr_t);
	extern void move_task(intptr_t);
	extern void color_task(intptr_t);
	
	#endif /* TOPPERS_MACRO_ONLY */
	
	#ifdef __cplusplus
	}
	#endif
	
	#endif
	'''
	
}