package mars.rover.generator

import mars.rover.missionsDSL.Mission
import mars.rover.missionsDSL.Condition
import mars.rover.missionsDSL.Action
import mars.rover.missionsDSL.Color
import mars.rover.missionsDSL.Relation
import mars.rover.missionsDSL.Sensor
import mars.rover.missionsDSL.EV3_ACTION

class MissionGenerator {

	def static getMissionCode(Mission mission)'''
	«switch mission.type {
		case AVOID: {
			getAvoidCode(mission);
		}
		case FIND: {
			getFindCode(mission);
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
	
	def static getGlobals(Mission mission){
		switch mission.type{
			case AVOID: {
			}
			case FIND: {
				getFindVariables(mission);
			}
			case FINDINORDER: {
				// TODO: Implement FindInOrder globals
			}
			case FINDSIMULTANEOUS: {
				// TODO: Implement find simultaneous globals
			}
		}
	}
	
	def static getFindVariables(Mission mission)'''
	bool «mission.name»_cond[«mission.actCond.length»];
	'''
	
	def static getAvoidCode(Mission mission)'''
	if («FOR c : mission.cond SEPARATOR " || "»«getConditionCode(c, true)»«ENDFOR») 
	{
		«FOR a : mission.actions »«getActionCode(a)»«ENDFOR»
	}
	'''
	
		
	def static getFindCode(Mission mission)'''
		
		«var x = 0»
		«FOR c : mission.actCond SEPARATOR " else "»
		«IF (mission.actCond.get(x).actions !== null)»
		if («getConditionCode(mission.actCond.get(x).cond, false)» && !«mission.name»_cond[«x»]){
			//if («getConditionCode(mission.actCond.get(x).cond, false)»){
			«mission.name»_cond[«x»] = true;
			«FOR act : mission.actCond.get(x++).actions»
				«IF (mission.actCond.get(x-1).cond.sensor == Sensor.COLOR && act.action == EV3_ACTION.MEASURE)»
					 adjust_for_measurement(«getColorCode(mission.actCond.get(x-1).cond.value.color)»);
				«ENDIF»
			«getActionCode(act)»
			«ENDFOR»
		}
		«ENDIF»
		«ENDFOR»
		«IF (mission.actions.length > 0)»
		else if (allTrue(«mission.name»_cond, «mission.cond.length»))
		{
			«FOR act : mission.actions»
			«getActionCode(act)»
			«ENDFOR»
		}
		«ENDIF»
	'''
	
	def static allTrue(boolean[] arr){
		var result = true;
		for (v : arr){
			result = result && v;
		}
		return result;
	}
	
	def static getActionCode(Action action)'''
	«switch action.action {
		case HALT: {
			"halt();"
		}
		case PLAY: {
			"play_note_for(" + action.value.value + ", " + action.duration.value + ");"
		}
		case REVERSE: {
			"reverse(" + action.duration.value + ");" // The DSL takes seconds, the C method milliseconds.
		}
		case ROTATE: {
			"rotate();"
		}
		case STOP: {
			"stop();"
		}
		case MEASURE: {
			"measure();"
		}
	}»
	'''
	
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
		switch color.value
		{
			case BLACK: {
				return "COLOR_BLACK";
			}
			case BLUE: {
				return "COLOR_BLUE";
			}
			case BROWN: {
				return "COLOR_BROWN";
			}
			case GREEN: {
				return "COLOR_GREEN";
			}
			case RED: {
				return "COLOR_RED";
			}
			case WHITE: {
				return "COLOR_WHITE";
			}
			case YELLOW: {
				return "COLOR_YELLOW";
			}
		}
	}
	
	def static getColorAvoidCond(Relation relation, Color color){
		var c1 = "color_r" + " " + getRelationCode(relation) + " " + getColorCode(color);
		var c2 = "color_l" + " " + getRelationCode(relation) + " " + getColorCode(color);
		var c3 = "color_m" + " " + getRelationCode(relation) + " " + getColorCode(color);
	
		return "("+c1 + " || " + c2 + " || " + c3+")";
	}
	

	def static getColorFindCond(Relation relation, Color color){
		var c1 = "color_r" + " " + getRelationCode(relation) + " " + getColorCode(color);
		var c2 = "color_l" + " " + getRelationCode(relation) + " " + getColorCode(color);
		var c3 = "color_m" + " " + getRelationCode(relation) + " " + getColorCode(color);
		
		return "("+c1 + " || " + c2 + " || " + c3+")";
	}
	
	def static getTouchCond(Relation relation, String b){
		var c1 = "touch_l" + " " + getRelationCode(relation) + b;
		var c2 = "touch_r" + " " + getRelationCode(relation) + b;
		return c1 + " || " + c2;
	}
	
	def static getConditionCode(Condition cond, boolean avoid){
		var code = ""
		switch cond.sensor
		{
			case COLOR: {
				if (avoid){
					code = getColorAvoidCond(cond.relation, cond.value.color);
				} else {
					code = getColorFindCond(cond.relation, cond.value.color);
				}
			}
			case FRONT_PROXIMITY: {
				code = "ultra_front_dist" + " " + getRelationCode(cond.relation) + " " + cond.value.integer.value
			}
			case BACK_PROXIMITY: {
				code = "ultra_back_dist" + " " + getRelationCode(cond.relation) + " " + cond.value.integer.value
			}
			case TOUCH: {
				code = getTouchCond(cond.relation, cond.value.bool.value);				
			}
		}
		return code;
	}
}