#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>
#include <alchemy/sem.h>

#define PERIOD 100000L
#define RUNS 10010
#define VALID_RUNS 10000

RTIME times[VALID_RUNS];
RTIME lastTime;
RT_SEM sem;

void writeIntToPin(int,int);

void writeValues()
{
    int fd, ret, errorCode;
    int one = 1;
    
    fd = open("/dev/rtdm/pinctrl-bcm2835/gpio4", O_WRONLY);
    //set device to output mode with special device request GPIO_RTIOC_DIR_OUT
    ret = ioctl(fd, GPIO_RTIOC_DIR_OUT, &one);
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to control the device 4. Error code: %d %s\n",  errorCode, strerror(errorCode));
    }
    writeIntToPin(0, fd);
    writeIntToPin(1, fd);
}

void writeIntToPin(int value, int fd)
{
    int ret, errorCode;
    ret = write(fd, &value, sizeof(int));   
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to write to the device. Error code: %d %s\n",  errorCode, strerror(errorCode));
    }
}

void handler(void* arg)
{
    int fd, pin, ret, value, errorCode, runCounter, validCounter;;
    char pinFile[50];

    pin = * (int*) arg;
    sprintf(pinFile, "/dev/rtdm/pinctrl-bcm2835/gpio%d", pin);   
    fd = open(pinFile, O_RDONLY);
    int xeno_trigger = GPIO_TRIGGER_EDGE_FALLING;
    ret = ioctl(fd, GPIO_RTIOC_IRQEN, &xeno_trigger); 
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to control the device %d. Error code: %d %s\n", pin, errorCode, strerror(errorCode));
    }
    else
    {
        runCounter, validCounter = 0;
        ret =read(fd, &value, sizeof(value));
        while (read(fd, &value, sizeof(value)) >= 0)
        {
            if (runCounter >= 10)
            {
                times[validCounter] = rt_timer_read() - lastTime;            
                validCounter++;
            }
            runCounter++;
        }
    }
}

void periodic(void* arg)
{
    int i;
 
    for (i = 0; i < RUNS; i++)
    {
        lastTime = rt_timer_read();
        writeValues();
        rt_task_wait_period(NULL);
    }
     
    rt_sem_v(&sem);
}


void write_RTIMES(char * filename, unsigned int number_of_values ,RTIME *time_values)
{
    unsigned int n=0;
    FILE *file;

    file = fopen(filename,"w");
    while (n<number_of_values) {
        fprintf(file,"%u,%lld\n",n,time_values[n]);  
        n++;
    }
    fclose(file);
 }


int main (int argc, char* args)
{
    RT_TASK task1, task2;  
    int handlerPin = 13;
   
    rt_sem_create(&sem, "semaphore", 0, S_FIFO);

    // Pin is initially 1. 
    writeValues();
 
    rt_task_create(&task1, "task1", 0, 50, 0);
    rt_task_create(&task2, "task2", 0, 50, 0);
    rt_task_set_periodic(&task1, TM_NOW, PERIOD);
    rt_task_start(&task2, &handler, &handlerPin);
    rt_task_start(&task1, &periodic, 0);       

    rt_sem_p(&sem, TM_INFINITE); 

    // The number of differences is the number of runs minus one
    write_RTIMES("time_diff.csv", VALID_RUNS-1, times);
}
