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
    int num = * (int *) arg;
    rt_printf("Task name: %s\nArgument: %d\n\n", curtaskinfo.name, num);


}

int main(int argc, char* argv[])
{
  char  str[10] ;
  int i, index = 100;

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
      rt_task_start(&tasks[i], &demo, &index);
      index += 10;

  }


  rt_printf("\nEnd of execution\n");
}
