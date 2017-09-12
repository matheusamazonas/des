#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <sys/mman.h>

#include <alchemy/task.h>

#define N 5

RT_TASK tasks[N];

void demo(void *arg) {
    RT_TASK_INFO curtaskinfo;
    rt_task_inquire(NULL,&curtaskinfo);
    rt_printf("Task name: %s \n", curtaskinfo.name);
}

int main(int argc, char* argv[])
{
  char  str[20] ;
  int i;

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
      rt_task_create(&tasks[i], str, 0, 50, 0);
      rt_task_start(&tasks[i], &demo, 0);

  }

  /*
   * Arguments: &task,
   *            task function,
   *            function argument
   */
  
  rt_printf("End of execution\n");
}
