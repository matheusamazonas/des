#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/sem.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>

#define N 300L

int fd2, fd3, fd4, fd17, fd27, fd22, fd10, fd9, f23;
int toRight = 1;
RTIME pRight= 0L, pLeft = 0L, tError = 0L;
RT_SEM sem;

typedef struct 
{
    int pin;
    RTIME time;;
} lightInfo;

//pRight = period to move from the sensor to the right and back
//pLeft = period to move from the sensor to the left and back

//FLAG
//toRight
//toLeft

//lastRight = Last time the clock blocked the sensor while moving to the right
//lastLeft = Last time the clock blocked the sensor while moving to the left

int initPin(int pin, int trigger, int in)
{
	int fd, ret, errorCode;
	char pinFile[50];

	sprintf(pinFile, "/dev/rtdm/pinctrl-bcm2835/gpio%d", pin);

	if (in)
	{
		fd = open(pinFile, O_RDONLY); 
		ret = ioctl(fd, GPIO_RTIOC_IRQEN, &trigger);
	}
	else
	{
		fd = open(pinFile, O_WRONLY);
		ret = ioctl(fd, GPIO_RTIOC_DIR_OUT, &trigger);
	}
    
	if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to control the device %d. Error code: %d %s\n", pin, errorCode, strerror(errorCode));
		return 0;
    }
	else
	{
		printf("Succesfully controlling pin %d\n", pin);
		return fd;
	}
}

void writeToPin(int fd, int value)
{
	int ret, errorCode;
	ret = write(fd, &value, sizeof(value));   
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to write to the device. Error code: %d %s\n", errorCode, strerror(errorCode));
    }	
}

void periodicLeft(void* arg)
{
	RTIME period;
	while (1) 
	{
		rt_sem_p(&sem, TM_INFINITE);
		if(!toRight)
		{
			//printf("Sleeping for: %llu. Period: %llu\n", pLeft/2 + period/4, period);
		    period = pRight + pLeft;
			rt_task_sleep(pLeft/2L + period/4L - tError);
			writeToPin(fd2, 1);
			rt_task_sleep(period/N);
			writeToPin(fd2, 0);
		}
	}
}

void periodicRight(void* arg)
{
	RTIME period;
	while(1)
	{
		rt_sem_p(&sem, TM_INFINITE);
		if (toRight)
		{
			//printf("Sleeping for: %llu. Period: %llu\n", pRight/2 - period/4, period);
		    period = pRight + pLeft;
			rt_task_sleep(pRight/2L + period/4L - tError);
			writeToPin(fd2, 1);
			rt_task_sleep(period/N); 
			writeToPin(fd2, 0);
		}
	}
}

void interrupt(void* arg)
{
	int ret, value, errorCode;
	RTIME lastRight = 0L, lastLeft = 0L, time, tFall = 0L;

	while (read(f23, &value, sizeof(value)) >= 0)
	{
		time = rt_timer_read();
	    if(value)
        {
            tError = (time - tFall)/2L;	
            //tError += 200000L;
            printf("Error: %llu\n", tError);
            toRight = !toRight;
		    if (toRight)
		    {
			    if (lastRight)
			    {
				    pLeft = time - lastLeft;
			    }
			    lastRight = time;
		    }
		    else
		    {
			    if (lastLeft)
			    {
				    pRight = time - lastRight;
			    }
			    lastLeft = time;	
		    }
		    if (pRight && pLeft)
		    {
			    rt_sem_broadcast(&sem);
		    }
        }
        else
        {
            tFall = time;
        }
	}
}

void init ()
{
	//int trigger = GPIO_TRIGGER_EDGE_RISING;
	int trigger = GPIO_TRIGGER_EDGE_FALLING|GPIO_TRIGGER_EDGE_RISING;

	fd2 = initPin(2, 0, 0);
	fd3 = initPin(3, 0, 0);
	fd4 = initPin(4, 0, 0);
	fd17 = initPin(17, 0, 0);
	fd27 = initPin(27, 0, 0);
	fd22 = initPin(22, 0, 0);
	fd10 = initPin(10, 0, 0);
	fd9 = initPin(9, 0, 0);
	f23 = initPin(23, trigger, 1);
}

int main (int argc, char* args)
{
    RT_TASK taskRight, taskLeft, sTask;

	rt_sem_create(&sem, "semaphore", 0, S_PRIO);

	init();    

	rt_task_create(&sTask, "sensor task", 0, 99, 0);
	rt_task_start(&sTask, &interrupt, 0);

	rt_task_create(&taskRight, "taskRight", 0, 50, 0);
    rt_task_start(&taskRight, &periodicRight, 0);
	
	rt_task_create(&taskLeft, "taskLeft", 0, 50, 0);
    rt_task_start(&taskLeft, &periodicLeft, 0);


    pause(); 
}




