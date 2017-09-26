#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>

#define EXECTIME   10e9   // execution time in ns
#define SPINTIME   5e8   // spin time in ns

RT_TASK t1;


void demo(void *arg)
{
    RTIME starttime, runtime;
    int fd,value, ret;
    
    fd=open("/dev/rtdm/pinctrl-bcm2835/gpio22",O_WRONLY);
    runtime = 0;
    while(runtime < EXECTIME) {
        rt_timer_spin(SPINTIME);  // spin cpu doing nothing

        if(runtime %1000000000 == 0){
            value=1; // set gpio pin HIGH; LOW is 0
            rt_printf("Led ON\n");
            
        }
        else{
            value = 0;
            rt_printf("Led OFF\n");
        }
        
        //set device to output mode with special device request GPIO_RTIOC_DIR_OUT
        ret=ioctl(fd, GPIO_RTIOC_DIR_OUT, &value);
        ret=write(fd, &value, sizeof(value));
        
        
        runtime = runtime + SPINTIME;

      
      
    }


    
}

int main(int argc, char* argv[]){

	char  str[10] ;

	sprintf(str,"myTask");
	rt_task_create(&t1, str, 0, 50, 0);
	rt_task_start(&t1, &demo, 0);


	
	
    
	

}

