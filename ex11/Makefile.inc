APPL_COBJS += 

APPL_CXXOBJS += movement.o 

SRCLANG := c++

ifdef CONFIG_EV3RT_APPLICATION

# Include libraries
include $(EV3RT_SDK_LIB_DIR)/libcpp-test/Makefile
include $(EV3RT_SDK_LIB_DIR)/lib2/Makefile
include $(EV3RT_SDK_LIB_DIR)/spp_master_test_api/Makefile

endif
