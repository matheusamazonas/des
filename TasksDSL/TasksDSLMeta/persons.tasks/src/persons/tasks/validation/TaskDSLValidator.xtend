/*
 * generated by Xtext 2.12.0
 */
package persons.tasks.validation

import org.eclipse.xtext.validation.Check
import persons.tasks.taskDSL.Task
import persons.tasks.taskDSL.Planning
import persons.tasks.taskDSL.TaskDSLPackage.Literals;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TaskDSLValidator extends AbstractTaskDSLValidator {
	
	@Check
	def checkTImeUnit(Task task){
		if (task.duration !== null){
			switch (task.duration.unit){
				case (MINUTE): {
					if (task.duration.dl > 1000){
						warning("Consider using another unit", Literals.TASK__DURATION)
					}
				}
				case DAY: {
					if (task.duration.dl > 150){
						info("Consider using weeks instead", Literals.TASK__DURATION)
					}
				}
				case HOUR: {
					null
				}
				case WEEK: {
					if (task.duration.dl > 52){
						error("Duration longer than 1 year not allowed", Literals.TASK__DURATION)
					}
				}
			}
		}
	}
	
	@Check
	def checkDoublePersons(Planning planning){
		var plist = planning.persons;
		for (var i = 0; i < plist.size; i++){
			for (var j = i+1; j < plist.size; j++){
				if (plist.get(i).name.equals(plist.get(j).name)){
					error("Double person name not allowed", Literals.PLANNING__PERSONS, j)
				}
			}
		}
	}
}
