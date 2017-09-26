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
} writeInfo;


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

void periodic(void *arg)
{
  writeInfo info = { .pin = 22, .value = 0};
  while (1) {
    writeValue(&info);  
    rt_task_wait_period(NULL);
    info.value = !info.value;
  }
  return;
}

int main (int argc, char* argv[])
{
    RT_TASK task;

    rt_task_create(&task, "task1", 0, 50, 0);
    rt_task_set_periodic(&task, TM_NOW, PERIOD);
    rt_task_start(&task, &periodic, 0);

    pause();
}
