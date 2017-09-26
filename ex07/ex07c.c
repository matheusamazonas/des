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
    int flag = 0;
    // let the task run RUNTIME ns in steps of SPINTIME ns
    runtime = 0;

	int fd2,value2, ret2;
    int fd,value;
    fd=open("/dev/rtdm/pinctrl-bcm2835/gpio22",O_WRONLY);
	fd2=open("/dev/rtdm/pinctrl-bcm2835/gpio23",O_RDONLY);
    int xeno_trigger=GPIO_TRIGGER_EDGE_FALLING|GPIO_TRIGGER_EDGE_RISING;
    ret2=ioctl(fd2, GPIO_RTIOC_IRQEN, &xeno_trigger);
    
    int count = 0;
    
    while(read(fd2, &value2, sizeof(value2)) != -1){
        
        count++;
        printf("interruptions counter %d\n", count);
        value = count % 2;
        ioctl(fd, GPIO_RTIOC_DIR_OUT, &value);
        write(fd, &value, sizeof(value));
    }


    rt_printf("end here");
    
}

int main(int argc, char* argv[]){

	char  str[10] ;
RTIME starttime, runtime;
	sprintf(str,"myTask");
	rt_task_create(&t1, str, 0, 50, 0);
	rt_task_start(&t1, &demo, 0);
// runtime = 0;
// 	int fd,value, ret;
    
//     fd=open("/dev/rtdm/pinctrl-bcm2835/gpio22",O_WRONLY);
    
//     while(runtime < EXECTIME) {
// 		rt_timer_spin(SPINTIME);  // spin cpu doing nothing

// 		if(runtime %1000000000 == 0){
// 			value=1; // set gpio pin HIGH; LOW is 0
// 			printf("Led ON\n");
      		
//     	}
//     	else{
//     		value = 0;
//     		printf("Led OFF\n");
//     	}
    	
// 		//set device to output mode with special device request GPIO_RTIOC_DIR_OUT
// 		ret=ioctl(fd, GPIO_RTIOC_DIR_OUT, &value);
// 		ret=write(fd, &value, sizeof(value));
	    
    	
//     	runtime = runtime + SPINTIME;

      
      
//     }
    printf("\nType CTRL-C to end this program\n\n" );
	pause();
	

}

