#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <alchemy/task.h>
#include <alchemy/sem.h>
#include <alchemy/timer.h>
#include <alchemy/mutex.h>

#define EXECTIME   2e8   // execution time in ns
#define SPINTIME   1e7   // spin time in ns

RT_MUTEX mut;
RT_TASK tHigh, tMed, tLow;

void high(void *arg) 
{
  int i;
 
  for (i = 0; i < 3; i++) {
    rt_printf("High priority task tries to lock mutex\n");
    rt_mutex_acquire(&mut,TM_INFINITE);
    rt_printf("High priority task locks mutex\n");
    rt_printf("High priority task unlocks mutex\n");
    rt_mutex_release(&mut);
  }
  rt_printf("..........................................High priority task ends\n");
}

void medium(void *arg) 
{
  RTIME starttime, runtime;
  runtime = 0;

  rt_printf("Medium task running\n");
  rt_task_start(&tHigh, &high, 0);    
   
  while(runtime < EXECTIME) {
    runtime = runtime + SPINTIME;
    rt_printf("Medium task running\n");
  }
  rt_printf("------------------------------------------Medium priority task ends\n"); 
}

void low(void *arg) 
{
  int i;

  rt_printf("Low priority task locks mutex\n");
  rt_mutex_acquire(&mut,TM_INFINITE);
  rt_task_start(&tMed, &medium, 0);

  for (i = 0; i < 3; i++) {
    rt_printf("Low priority task unlocks mutex\n");
    rt_mutex_release(&mut);
    rt_printf("Low priority task locks mutex\n");
    rt_mutex_acquire(&mut,TM_INFINITE);
  }
  rt_printf("..........................................Low priority task ends\n");
}

int main(int argc, char* argv[])
{
  rt_mutex_create(&mut, "Mutex1");
  
  rt_task_create(&tLow, "tLow", 0, 60, 0);
  rt_task_create(&tMed, "tMed", 0, 70, 0);
  rt_task_create(&tHigh, "tHigh", 0, 80, 0);

  rt_task_start(&tLow, &low, 0);
  rt_task_start(&tMed, &medium, 0);
  rt_task_start(&tHigh, &high, 0);

  pause();
}
