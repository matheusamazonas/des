package mars.rover.generator

import mars.rover.missionsDSL.Mission
import mars.rover.missionsDSL.Condition
import mars.rover.missionsDSL.Action
import mars.rover.missionsDSL.Color
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
	if («FOR c : mission.cond SEPARATOR " || "»«getConditionCode(c, true)»«ENDFOR») 
	{
		«FOR a : mission.actionsAfterSetOfConditions »«getActionCode(a)»«ENDFOR»
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
	
	// TODO: Implement the middle color sensor after bluetooth setup
	def static getColorAvoidCond(Relation relation, Color color){
		var c1 = "color_r" + " " + getRelationCode(relation) + " " + getColorCode(color);
		var c2 = "color_l" + " " + getRelationCode(relation) + " " + getColorCode(color);
		//var c3 = "getColorM()" + " " + getRelationCode(relation) + " " + getColorCode(color);
		//var c3 = "true";
		return c1 + " || " + c2;// + " || " + c3;
	}
	
	// TODO: Implement this for finding colors. Currently using just Color_Right
	def static getColorFindCond(Relation relation, Color color){
		return "getColorR()" + " " + getRelationCode(relation) + " " + getColorCode(color);
	}
	
	def static getTouchCond(Relation relation, String b){
		var c1 = "getColorR()" + " " + getRelationCode(relation) + b;
		var c2 = "getColorL()" + " " + getRelationCode(relation) + b;
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
			case PROXIMITY: {
				code = "getUltraBack()" + " " + getRelationCode(cond.relation) + " " + cond.value.integer.toString()
			}
			case TOUCH: {
				code = getTouchCond(cond.relation, cond.value.bool);				
			}
		}
		return code;
	}
}