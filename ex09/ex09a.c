#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/sem.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>
#include <wiringPi.h>

#define N 500

int fd2, fd3, fd4, fd17, fd27, fd22, fd10, fd9, f23;
int right;
RTIME tRight= 0L, tLeft = 0L;
RT_SEM sem;

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
		period = tRight + tLeft;
		if(right)
		{
			//printf("Sleeping for: %llu. Period: %llu\n", tLeft/2 + period/4, period);
			rt_task_sleep(tLeft/2L + period/4L);
			writeToPin(fd2, 1);
			rt_task_sleep(period/N);
			writeToPin(fd2, 0);
		}
	}
}

void periodicRight (void* arg)
{
	RTIME period;
	while(1)
	{
		rt_sem_p(&sem, TM_INFINITE);
		period = tRight + tLeft;
		if (!right)
		{
			//printf("Sleeping for: %llu. Period: %llu\n", tRight/2 - period/4, period);
			rt_task_sleep(tRight/2L + period/4L);
			writeToPin(fd2, 1);
			rt_task_sleep(period/N); 
			writeToPin(fd2, 0);

		}
	}
}

void interrupt(void* arg)
{
	int ret, value, errorCode;
	RTIME lastRight = 0L, lastLeft = 0L, time;

	while (read(f23, &value, sizeof(value)) >= 0)
	{
		time = rt_timer_read();
		//printf("tRise: %llu tFall: %llu time: %llu\n", timeRise, timeFall, time);
		if (right)
		{
			if (lastRight)
			{
				//printf("Initializing left\n");
				tLeft = time - lastRight;
			}
			lastLeft = time;
		}
		else
		{
			if (lastLeft)
			{
				tRight = time - lastLeft;
				//printf("Setting right\n");
			}
			lastRight = time;	
		}
		//printf("Delta: %llu\n", rt_timer_read() - lastI);
		//printf("Got an interruption\n");
		if (tRight && tLeft)
		{
			//printf("tRight: %llu tLeft: %llu\n", tRight, tLeft);
			//printf("Letting the semaphore go.\n");
			//rt_sem_v(&sem);
			rt_sem_broadcast(&sem);
		}
		right = !right;
	}
}

void init ()
{
	//int trigger = GPIO_TRIGGER_EDGE_RISING;
	int trigger = GPIO_TRIGGER_EDGE_FALLING;

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

	// gpio Pin with INcoming interrupt
    int PIN =23;
    
    // use wiringpi code to turn on pi's internal pullup circuit for input pin
    // initialize wiringpi library to gpio mode
    if (wiringPiSetupGpio() < 0)
    {
         printf("\n\n stopped program : Unable to setup wiringPi with GPIO \n\n");
         exit(1);
    }

	rt_sem_create(&sem, "semaphore", 0, S_PRIO);

	init();    

	// setup internal pull up resister
    // possible values : PUD_UP,PUD_DOWN,PUD_OFF (floating)
    pullUpDnControl (PIN,PUD_UP);// returns void  

	rt_task_create(&sTask, "sensor task", 0, 99, 0);
	rt_task_start(&sTask, &interrupt, 0);

	rt_task_create(&taskRight, "taskRight", 0, 50, 0);
    rt_task_start(&taskRight, &periodicRight, 0);
	
	rt_task_create(&taskLeft, "taskLeft", 0, 50, 0);
    rt_task_start(&taskLeft, &periodicLeft, 0);


    pause(); 
}




