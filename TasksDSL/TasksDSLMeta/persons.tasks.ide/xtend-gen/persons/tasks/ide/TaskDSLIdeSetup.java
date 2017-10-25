/**
 * generated by Xtext 2.12.0
 */
package persons.tasks.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import persons.tasks.TaskDSLRuntimeModule;
import persons.tasks.TaskDSLStandaloneSetup;
import persons.tasks.ide.TaskDSLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TaskDSLIdeSetup extends TaskDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    TaskDSLRuntimeModule _taskDSLRuntimeModule = new TaskDSLRuntimeModule();
    TaskDSLIdeModule _taskDSLIdeModule = new TaskDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_taskDSLRuntimeModule, _taskDSLIdeModule));
  }
}
