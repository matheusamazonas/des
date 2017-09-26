#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <rtdm/gpio.h>

#define PERIOD 500000000L

typedef struct 
{
    int pin;
    int value;
}  writeInfo;

void writeValue(writeInfo* info);

void readInterruption(void* arg)
{
    int fd, pin, ret, value, errorCode, counter;
    char pinFile[50];
    
    pin = * (int*) arg;
    sprintf(pinFile, "/dev/rtdm/pinctrl-bcm2835/gpio%d", pin);   
    fd = open(pinFile, O_RDONLY);
    //set device to input mode with special device request GPIO_RTIOC_DIR_IN
    int xeno_trigger = GPIO_TRIGGER_EDGE_FALLING|GPIO_TRIGGER_EDGE_RISING;
    ret = ioctl(fd, GPIO_RTIOC_IRQEN, &xeno_trigger); 
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to control the device %d. Error code: %d %s\n", pin, errorCode, strerror(errorCode));
    }
    else
    {
        counter = 1;
        while (read(fd, &value, sizeof(value)) >= 0)
        {
            writeInfo info = { .pin = 22, .value = value};
            writeValue(&info);
            printf("Number of interruptions: %d\n", counter);
            counter++;
        }
    }
}

void writeValue(writeInfo* info)
{
    int fd, ret, errorCode;
    char pinFile[50];
    sprintf(pinFile, "/dev/rtdm/pinctrl-bcm2835/gpio%d", info->pin);   
    fd = open(pinFile, O_WRONLY);
    //set device to output mode with special device request GPIO_RTIOC_DIR_OUT
    ret = ioctl(fd, GPIO_RTIOC_DIR_OUT, &info->value);
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to control the device %d. Error code: %d %s\n", info->pin, errorCode, strerror(errorCode));
    }
    ret = write(fd, &info->value, sizeof(info->value));   
    if (ret < 0)
    {
        errorCode = -ret;
        printf("Error when trying to write to the device %d. Error code: %d %s\n", info->pin, errorCode, strerror(errorCode));
    }
}

int main (int argc, char* argv[])
{
    RT_TASK task1;
    int pin = 23;

    rt_task_create(&task1, "task1", 0, 50, 0);
    rt_task_start(&task1, &readInterruption, &pin);

    pause();
}
