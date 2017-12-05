package mars.rover.generator

import mars.rover.missionsDSL.Robot

class MakefileGenerator {
	
	def static toMake(Robot root, boolean isMaster)'''
	
	APPL_COBJS += 
	
	«IF isMaster»
	APPL_CXXOBJS += master.o 
	«ELSE»
	APPL_CXXOBJS += slave.o
	«ENDIF»
	
	SRCLANG := c++
	
	ifdef CONFIG_EV3RT_APPLICATION
	
	# Include libraries
	include $(EV3RT_SDK_LIB_DIR)/libcpp-test/Makefile
	include $(EV3RT_SDK_LIB_DIR)/lib2/Makefile
	include $(EV3RT_SDK_LIB_DIR)/spp_master_test_api/Makefile
	
	endif

	
	'''
	
}