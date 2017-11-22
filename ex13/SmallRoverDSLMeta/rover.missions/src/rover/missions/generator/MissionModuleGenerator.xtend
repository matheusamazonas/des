package rover.missions.generator

import rover.missions.roverDSL.Robot
import rover.missions.roverDSL.Mission
import rover.missions.roverDSL.Color

class MissionModuleGenerator {
	def static toModuleCpp(Robot root) '''

	'''

	def static toModuleH(Robot root) '''
		
	'''

	def static CharSequence mission2Text(Mission mission) {

	}

	def static CharSequence missionFindColors() {
		return ''''''
	}

	def static CharSequence missionDetectBottle() {
		return '''
			
			
			
						
			
		'''
	}

	def static CharSequence missionAvoidColors(Mission mission) {
		return '''
			
					
			
			
		'''
	}

	def static CharSequence missionFollowLine() {
		return ''''''
	}

	def static CharSequence colorsConditions2Text(Color color) {
		switch (color.getName) {
			case "blue": return '''color == COLOR_BLUE'''
			case "yellow": return '''color == COLOR_YELLOW'''
			case "red": return '''color == COLOR_RED'''
		}
	}

}
