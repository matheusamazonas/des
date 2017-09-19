#include <stdio.h>
#include <signal.h>
#include <unistd.h>

#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <alchemy/sem.h>

#define ITER 10

static RT_TASK  t1;
static RT_TASK  t2;
static RT_TASK  t3;
static RT_TASK  t4;

int global = 0;
RT_SEM contr, contr2; 


void taskOne(void *arg)
{
    int i, num;
    num = * (int *) arg;
    for (i=0; i < ITER; i++) {
        rt_sem_p(&contr, TM_INFINITE);
        printf("I am taskTwo and global (%d)) = %d----------------\n", num, ++global);
        rt_sem_v(&contr2);
        
        
    }
}

void taskTwo(void *arg)
{
    int i, num;
    num = * (int *) arg;
    for (i=0; i < ITER; i++) {
        rt_sem_p(&contr2, TM_INFINITE);
        printf("I am taskTwo and global (%d)) = %d----------------\n", num , --global);
        rt_sem_v(&contr);
        
    }
}

int main(int argc, char* argv[]) {

    int index = 1;
    rt_sem_create(&contr, "whatever", 1, S_FIFO);
    rt_sem_create(&contr2, "whatever2", 1, S_FIFO);
    rt_task_create(&t1, "task1", 0, 1, 0);
    rt_task_create(&t2, "task2", 0, 1, 0);
    rt_task_create(&t3, "task3", 0, 1, 0);
    rt_task_create(&t4, "task4", 0, 1, 0);
    rt_task_start(&t1, &taskOne, &index);
    index++;
    rt_task_start(&t2, &taskTwo, &index);
    index++;
    rt_task_start(&t3, &taskOne, &index);
    index++;
    rt_task_start(&t4, &taskTwo, &index);
    index++;
    return 0;
}
