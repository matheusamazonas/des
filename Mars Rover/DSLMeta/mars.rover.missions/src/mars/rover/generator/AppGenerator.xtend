package mars.rover.generator

import mars.rover.missionsDSL.Robot

class AppGenerator {
	
	def static commonCpp()'''
	#include "common.h"
	
	int32_t FONT_WIDTH, FONT_HEIGHT;
	
	int32_t NLINES;
	int line = 0;
	
	ledcolor_t led_color;
	
	void play_note_for(float note, int duration)
	{
		ev3_speaker_play_tone(note, duration);
	}
	
	bool allTrue(bool arr[], int length)
	{
		bool result = true;
		for (int i = 0; i < length; i ++)
		{
			result &= arr[i];	
		}
		return result;
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
	
	void set_font(lcdfont_t font) 
	{
	    ev3_lcd_set_font(font);
	    ev3_font_get_size(font, &FONT_WIDTH, &FONT_HEIGHT);
	}
	
	void set_led(ledcolor_t color, float duration)
	{
		ledcolor_t previous = led_color; 
		led_color = color;	
		ev3_led_set_color(color);
		if (duration > 0)
		{
			dly_tsk(duration);
			ev3_led_set_color(previous);
			led_color = previous;
		}
	}
	
	void setup()
	{
		ulong_t time;
		get_tim(&time);
		srand(time);
		
		ev3_led_set_color(LED_ORANGE);
		ev3_lcd_set_font(EV3_FONT_SMALL);
		ev3_font_get_size(EV3_FONT_SMALL, &FONT_WIDTH, &FONT_HEIGHT);
		NLINES = EV3_LCD_HEIGHT / FONT_HEIGHT;
	}
	'''
	
	def static commonHeader()'''
	// Matheus Andrade and Alan Andrade
	
	#pragma once
	
	#include "ev3api.h"
	
	#ifndef STACK_SIZE
	#define	STACK_SIZE 4096
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
	
	#endif
	
	struct mission_info{
		const char *name;
		bool status;
	};
	
	/**
	 * Functions
	 */
	
	extern void play_note_for(float, int);
	extern bool allTrue(bool[], int);
	extern void cycle_print(char*); 
	extern void set_led(ledcolor_t, float duration);
	extern void setup();
	'''
	
	def static toCfg(Robot root, boolean master)'''
	INCLUDE("app_common.cfg");
	
	#include "app.h"
		
	DOMAIN(TDOM_APP) {
	CRE_TSK(MAIN_TASK, { TA_ACT, 0, main_task, TMIN_APP_TPRI+4, STACK_SIZE, NULL });
	«IF master»
	CRE_TSK(ACT_TASK, {TA_NULL, 0, act_task, TMIN_APP_TPRI+2, STACK_SIZE, NULL });
	CRE_TSK(SENSE_TASK, {TA_NULL, 0, sense_task, TMIN_APP_TPRI+3, STACK_SIZE, NULL });
	
	«ENDIF»
	}
	ATT_MOD("app.o");
	'''
}