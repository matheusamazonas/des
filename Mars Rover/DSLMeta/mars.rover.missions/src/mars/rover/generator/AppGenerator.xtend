package mars.rover.generator

import mars.rover.missionsDSL.Robot

class AppGenerator {
	
	def static toCfg(Robot root, boolean isMaster)'''
	
		INCLUDE("app_common.cfg");
		
		«IF isMaster»
		#include "master.h"
		«ELSE»
		#include "slave.h"
		«ENDIF»
			
		DOMAIN(TDOM_APP) {
		CRE_TSK(MAIN_TASK, { TA_ACT, 0, main_task, TMIN_APP_TPRI, STACK_SIZE, NULL });
		CRE_TSK(ACT_TASK, {TA_NULL, 0, act_task, TMIN_APP_TPRI+2, STACK_SIZE, NULL });
		CRE_TSK(SENSE_TASK, {TA_NULL, 0, sense_task, TMIN_APP_TPRI+1, STACK_SIZE, NULL });
		}
		
		ATT_MOD("app.o");
	
	'''
}