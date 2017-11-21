package rover.missions.generator

import rover.missions.roverDSL.Robot
import rover.missions.roverDSL.Color
import rover.missions.roverDSL.Colors
import org.eclipse.emf.common.util.EList

class MissionModuleGenerator {
	def static toModuleCpp(Robot root) '''
		#include "«root.mission.id».h"
		
		void check_for_obstacles();
		int32_t FONT_WIDTH, FONT_HEIGHT;
				«IF root.mission.id == "FindColors"»int *cs;«ENDIF»
				
				
				// Speed settings
				uint32_t DRIVE_SPEED = «root.defaultSpeed»,
					SPECIAL_SPEED = «root.slowSpeed»,
					MAX_ROT_DUR = «root.maxAngle * 14»,
					MIN_ROT_DUR = «root.minAngle * 14»,
					REVERSE_DUR = 1000,
					SENSOR_REFRESH_RATE = 50,
					BEEP_DURATION = 200;
					
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
								touch_right = false;
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
								ulong_t current_time = 0L, init_time;
							
								ev3_motor_set_power(LEFT_P, -SPECIAL_SPEED);
								ev3_motor_set_power(RIGHT_P, -SPECIAL_SPEED);
							
								get_tim(&init_time);
							
								while (init_time + REVERSE_DUR > current_time)
								{
									read_sensors(1);
									«IF root.mission.id == "FindColors"»check_colors();«ENDIF»
									sleep(100);
									get_tim(&current_time);
								}
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
							
							void blink_led(ledcolor_t color, ledcolor_t reset, float duration)
							{
								ev3_led_set_color(color);
								dly_tsk(duration);
								ev3_led_set_color(reset);
							}
							void move_towards()
							{
								ev3_motor_set_power(LEFT_P, DRIVE_SPEED);
								ev3_motor_set_power(RIGHT_P, DRIVE_SPEED);
							}
							void avoid(int direction)
							{
								ev3_led_set_color(LED_RED);
								ev3_speaker_play_tone(NOTE_A4, BEEP_DURATION);
								reverse();
								rotate_in_axis(direction);
								ev3_led_set_color(LED_GREEN);
							}
							«IF root.mission.id == "FindColors"» 
								void check_colors()
								{
									switch (color)
									{
										«colors2CaseText(root.mission.find)»
										default:
											break;
									}
								} 
							«ENDIF»
							
							void check_for_obstacles()
										{
											read_sensors(1);
											«IF root.mission.id == "FindColors"»check_colors();«ENDIF»
											
											if (color == COLOR_BLACK «IF root.mission.id == "AvoidColors"»«FOR color : root.mission.avoid.color BEFORE " || " SEPARATOR " || "»«colorsConditions2Text(color)»«ENDFOR» «ENDIF»)
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
											else if (ultrasonic <= «IF root.mission.id == "DetectBottle"»«root.mission.bottle.maxDistance»«ENDIF» 
											«IF root.mission.id != "DetectBottle"»22«ENDIF»)
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
							
							void init() 
									{
										ulong_t time;
										//	Motor init
										ev3_motor_config(LEFT_P, LARGE_MOTOR);
										ev3_motor_config(RIGHT_P, LARGE_MOTOR);
										//	Sensor init
										ev3_sensor_config(ULTRA_P, ULTRASONIC_SENSOR);
										ev3_sensor_config(COLOR_P, COLOR_SENSOR);
										ev3_sensor_config(TLEFT_P, TOUCH_SENSOR);
										ev3_sensor_config(TRIGHT_P, TOUCH_SENSOR);
										// Initialize the random generator
										get_tim(&time);
										srand(time);
									
										ev3_lcd_set_font(EV3_FONT_SMALL);
										   ev3_font_get_size(EV3_FONT_SMALL, &FONT_WIDTH, &FONT_HEIGHT);
									
										// Set lights and wait for initial sensor values
										ev3_led_set_color(LED_ORANGE);
										wait_for_white();
										wait_for_ultra();
										ev3_led_set_color(LED_GREEN);
									}
									
									void read_sensors(int display_line) 
									{
										touch_left = ev3_touch_sensor_is_pressed(TLEFT_P);
										touch_right = ev3_touch_sensor_is_pressed(TRIGHT_P);
										color = ev3_color_sensor_get_color(COLOR_P);
										ultrasonic = ev3_ultrasonic_sensor_get_distance(ULTRA_P);
									}
									
									void stop()
											{
												// stop and close
												ev3_motor_stop(LEFT_P, true);
												ev3_motor_stop(RIGHT_P, true);
												ev3_led_set_color(LED_OFF);
											}
											
											void move(«IF root.mission.id == "FindColors"» int* colors «ENDIF») 
											{
												«IF root.mission.id == "FindColors"» cs = colors;«ENDIF»
												while(true)
												{
													«IF root.mission.id == "FindColors"»if( «colors2ConditionsText(root.mission.find.color)» == «root.mission.find.color.length» ){
														stop();
														break;
														}
													«ENDIF»
													check_for_obstacles();
													   move_towards();
													   sleep(SENSOR_REFRESH_RATE);
												}
											}
		
		
	'''

	def static toModuleH(Robot root) '''
		#include "app.h"
		
		void move(«IF root.mission.id == "FindColors"»int* colors«ENDIF»);
		void stop();
		void blink_led(ledcolor_t, ledcolor_t, float);
		«IF root.mission.id == "FindColors"»void check_colors();«ENDIF»
	'''

	
	def static CharSequence colors2Text(String color) {
		switch(color){
			case "red": return '''COLOR_RED'''
			case "blue": return '''COLOR_BLUE'''
			case "yellow": return '''COLOR_YELLOW'''
		}
	}
	
	def static CharSequence colors2CaseText(Colors colors) {
		switch(colors.color.length){
			case 1: return '''case («colors2Text(colors.color.get(0).getName)»):
					cs[0] = 1;
					break;'''
			case 2: return '''case («colors2Text(colors.color.get(0).getName)»):
					cs[0] = 1;
					break;
				case («colors2Text(colors.color.get(1).getName)»):
				  	cs[1] = 1;
				  	break;'''
			case 3: return '''case («colors2Text(colors.color.get(0).getName)»):
					cs[0] = 1;
					break;
				case («colors2Text(colors.color.get(1).getName)»):
				   	cs[1] = 1;
					break;
				case («colors2Text(colors.color.get(2).getName)»):
					cs[2] = 1;
					break;'''
				
		}
	}
	
	def static CharSequence colors2ConditionsText(EList<Color> colors) {
		switch(colors.length){
			case 1: return '''cs[0]'''
			case 2: return '''(cs[0] + cs[1])'''
			case 3: return '''(cs[0] + cs[1] + cs[2])'''
				
		}
	}


	def static CharSequence colorsConditions2Text(Color color) {
		switch (color.getName) {
			case "blue": return '''color == COLOR_BLUE'''
			case "yellow": return '''color == COLOR_YELLOW'''
			case "red": return '''color == COLOR_RED'''
		}
	}

}
