#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <sys/mman.h>

#include <alchemy/task.h>
#include <alchemy/sem.h>

#define N 5

RT_TASK tasks[N];
RT_SEM contr;

void demo(void *arg) {
    
    rt_sem_p(&contr, TM_INFINITE);
    RT_TASK_INFO curtaskinfo;
    rt_task_inquire(NULL,&curtaskinfo);
    int num = * (int *) arg;
    rt_printf("\nTask name: %s\nArgument: %d\n", curtaskinfo.name, num);
    

}

int main(int argc, char* argv[])
{
  char  str[10] ;
  int i, prio = 10, index = 100;

  // Perform auto-init of rt_print buffers if the task doesn't do so
  //rt_print_auto_init(1);

  // Lock memory : avoid memory swapping for this program
  mlockall(MCL_CURRENT|MCL_FUTURE);

  rt_printf("start tasks\n");

  /*
   * Arguments: &task,
   *            name,
   *            stack size (0=default),
   *            priority,
   *            mode (FPU, start suspended, ...)
   */
   rt_sem_create(&contr, "mySem", 0, S_PRIO);
    
  for(i = 0; i < N; i++){
    long long unsigned createTime, startTime;
    
    sprintf(str,"%d",(i+1));
    //saves the time in which the task was created;
    createTime = rt_timer_read();
    rt_task_create(&tasks[i], str, 0, prio, 0);
    rt_task_start(&tasks[i], &demo, &index);
    //saves the time in which the task was started;
    startTime = rt_timer_read();
    rt_printf("Creation time [%d]: %llu | Start time [%d]: %llu \n", i+1 ,createTime, i+1 , startTime);
    index += 10;
    prio += 10;

  }

  rt_sem_broadcast(&contr);


  rt_printf("\nEnd of execution\n");
}
