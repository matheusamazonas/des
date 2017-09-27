#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <alchemy/task.h>
#include <alchemy/timer.h>
#include <alchemy/sem.h>

#define PERIOD 100000L
#define RUNS 10010
#define VALID_RUNS 10000

RTIME times[VALID_RUNS];
RT_SEM sem;

void periodic(void* arg)
{
    int i, runs = 0;
    
    for (i = 0; i < RUNS; i++)
    {
        // We ignore the first 10 runs
        if (i >= 10)
        {
            times[runs] = rt_timer_read();
            runs++;               
        }
        rt_task_wait_period(NULL);
    } 
    rt_sem_v(&sem);
}

void differences()
{
    int i;
    
    for(i = 0; i < VALID_RUNS-1; i++)
    {
       times[i] = times[i+1] - times[i]; 
    }
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
    RT_TASK task;  
    rt_sem_create(&sem, "semaphore", 0, S_FIFO);

    rt_task_create(&task, "task", 0, 50, 0);
    rt_task_set_periodic(&task, TM_NOW, PERIOD);
    rt_task_start(&task, &periodic, 0);        
    
    rt_sem_p(&sem, TM_INFINITE);

    differences();
    // The number of differences is the number of runs minus one
    write_RTIMES("time_diff.csv", VALID_RUNS-1, times);
}
