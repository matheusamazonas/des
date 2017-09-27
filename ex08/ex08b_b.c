#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>

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
    int fd, pin, ret, value, errorCode, counter;
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
        counter = 0;
        while (read(fd, &value, sizeof(value)) >= 0)
        {
            writeValues();
            counter++;
        }
    }
}

int main (int argc, char* args)
{
    RT_TASK task1;  
    int handlerPin = 13;
   
    // Pin is initially 1. 
    writeValues();
 
    rt_task_create(&task1, "task1", 0, 50, 0);
    rt_task_start(&task1, &handler, &handlerPin);

    pause(); 
}

