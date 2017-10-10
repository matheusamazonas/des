#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/sem.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>

#define N 300L

int fd2, fd3, fd4, fd17, fd27, fd22, fd10, fd9, f23;
int toRight;
RTIME period;
RT_SEM sem;

typedef struct 
{
    int pin;
    int value;
} lightInfo;

lightInfo** matX;

lightInfo** getX();

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

int getPinByNumber(int number)
{
    switch(number)
    {
        case 2:
            return fd2;
        case 3:
            return fd3;
        case 4: 
            return fd4;
        case 17:
            return fd17;
        case 27:
            return fd27;
        case 22:
            return fd22;
        case 9:
            return fd9;
        case 10:
            return fd10;
    }
}

void setColumnValues(lightInfo* column, int on)
{
    int i;
    int pinFd;
    for (i = 0; i < 8; i++)
    {
        if (column[i].value)
        {
            pinFd = getPinByNumber(column[i].pin);
            writeToPin(pinFd, on);
        }
    }
}

void periodicRight(void* arg)
{
    int j;
	while(1)
	{
		rt_sem_p(&sem, TM_INFINITE);
		for (j = 0; j < 8; j++)
        {
            setColumnValues(matX[j], 1);
            rt_task_sleep(period/N);
            setColumnValues(matX[j], 0);
        }
	}
}

void interrupt(void* arg)
{
	int ret, value, errorCode;
	RTIME lastTime = 0L, time;

	while (read(f23, &value, sizeof(value)) >= 0)
	{
		if (toRight && period)
		{
			rt_sem_broadcast(&sem);
		}
		toRight = !toRight;
		time = rt_timer_read();
		if (lastTime)
		{
			period = time - lastTime;
		}
		lastTime = time;
	}
}

void init ()
{
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

    matX = getX();
}

lightInfo** getX()
{
    int i, j; 
    lightInfo **x = calloc(8, sizeof(lightInfo*));
    for (i = 0; i < 8; i++)
    {
        x[i] = calloc(8, sizeof(lightInfo));
    }
    for(i = 0, j = 0; i < 8 && j < 8; i++, j++)
    {
        x[i][j].pin = getPinByLine(i);
        x[i][j].value = 0;
    }
    for (i = 0, j = 7; i <= 7, j >= 0; i++, j--)
    {
        x[i][i].pin = getPinByLine(i); 
        x[i][i].value = 1;
        x[j][i].pin = getPinByLine(i);  
        x[j][i].value = 1;
    }
    /*for(i = 0; i < 8; i++)
    {
        for (j = 0; j < 8; j++)
        {
            printf("%d ", x[i][j].pin);
        }
        printf("\n");
    }*/ 
    return x;
} 

int getPinByLine(int line)
{
    switch(line)
    {
        case 0:
            return 2;
        case 1:
            return 3;
        case 2:
            return 4;
        case 3:
            return 17;
        case 4:
            return 27;
        case 5:
            return 22;
        case 6:
            return 10;
        case 7:
            return 9;
    }
}

int main (int argc, char* args)
{
    RT_TASK taskRight, sTask;

	rt_sem_create(&sem, "semaphore", 0, S_PRIO);

	init();    

	rt_task_create(&sTask, "sensor task", 0, 99, 0);
	rt_task_start(&sTask, &interrupt, 0);

	rt_task_create(&taskRight, "taskRight", 0, 50, 0);
    rt_task_start(&taskRight, &periodicRight, 0);
	
    pause(); 
}




