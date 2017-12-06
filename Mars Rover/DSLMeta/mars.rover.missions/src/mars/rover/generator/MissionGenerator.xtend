package mars.rover.generator

import mars.rover.missionsDSL.Mission
import mars.rover.missionsDSL.Condition
import mars.rover.missionsDSL.Action
import mars.rover.missionsDSL.Sensor
import mars.rover.missionsDSL.Color
import mars.rover.missionsDSL.Value
import mars.rover.missionsDSL.Relation

class MissionGenerator {

	def static getMissionCode(Mission mission)'''
	«switch mission.type {
		case AVOID: {
			getAvoidCode(mission);
		}
		case FIND: {
			// TODO: Implement find
		}
		case FINDINORDER: {
			// TODO: Implement find in order
		}
		case FINDSIMULTANEOUS: {
			// TODO: Implement find simultaneous
		}
	}
	»
	'''
	
	def static getAvoidCode(Mission mission)'''
	if («FOR c : mission.cond SEPARATOR " || "»«getConditionCode(c)»«ENDFOR») {
		«FOR a : mission.actions»«getActionCode(a)»«ENDFOR»
	}
	'''
	
	def static getActionCode(Action action)'''
	«switch action.action {
		case HALT: {
			"halt();"
		}
		case PLAY: {
			// TODO: Implement playing sounds
		}
		case REVERSE: {
			"reverse(" + action.duration*1000 + ");" // The DSL takes seconds, the C method milliseconds.
		}
		case ROTATE: {
			"rotate();"
		}
		case STOP: {
			"stop();"
		}
	}»
	'''
	
	def static getSensorCode(Sensor sensor){
		switch sensor
		{
			case COLOR: {
				"ev3_color_sensor_get_color(COLOR_R_P)"
			}
			case PROXIMITY: {
				// TODO: Get ultrasonic value from slave
			}
			case TOUCH: {
				// TODO: Get ultrasonic value from slave
			}
		}
	}
	
	def static getValueCode(Value value){
		// TODO: Implement values of other types (int, bool)
		return getColorCode(value.color);
	}
	
	def static getRelationCode(Relation relation){
		switch relation
		{
			case EQ: {
				return "==";
			}
			case GE: {
				return "<=";
			}
			case GT: {
				return "<";
			}
			case LE: {
				return ">=";
			}
			case LT: {
				return ">";
			}
			
		}
	}
	
	def static getColorCode(Color color){
		switch color
		{
			case BLACK: {
				"COLOR_BLACK"
			}
			case BLUE: {
				"COLOR_BLUE"
			}
			case BROWN: {
				"COLOR_BROWN"
			}
			case GREEN: {
				"COLOR_GREEN"
			}
			case RED: {
				"COLOR_RED"
			}
			case WHITE: {
				"COLOR_WHITE"
			}
			case YELLOW: {
				"COLOR_YELLOW"
			}
		}
	}
	
	def static getConditionCode(Condition cond){
		getSensorCode(cond.sensor) + " " + getRelationCode(cond.relation) + " " + getValueCode(cond.value);
	}
}