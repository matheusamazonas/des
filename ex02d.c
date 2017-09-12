#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <sys/mman.h>

#include <alchemy/task.h>

#define N 3

RT_TASK tasks[N];

void periodic(void *arg)
{
  rt_task_sleep(1000000000);
  long long num = * (long long *) arg;
  rt_task_set_periodic(NULL, TM_NOW, num);
  while (1) {
    rt_printf("\nTask with period: %lld is being executed", num);
    rt_task_wait_period(NULL);
  }
  return;
}

int main(int argc, char* argv[])
{
  char  str[10] ;
  int i;
  long long periods[N];

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

  for(i = 0; i < N; i++){
      sprintf(str,"%d",(i+1));
      periods[i] = (i+1)*1000000000L;
      rt_task_create(&tasks[i], str, 0, 50, 0);
      rt_task_start(&tasks[i], &periodic, &periods[i]);

  }
    printf("end program by CTRL-C\n");
    pause();
  
}
