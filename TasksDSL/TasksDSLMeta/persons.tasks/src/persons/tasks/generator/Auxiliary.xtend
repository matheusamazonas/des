package persons.tasks.generator

import java.util.List
import persons.tasks.taskDSL.Planning
import persons.tasks.taskDSL.Action
import persons.tasks.taskDSL.Task
import java.util.ArrayList

class Auxiliary {
	def static List<Action> getActions(Planning root) {
		var List<Action> actionlist = new ArrayList<Action>()
		for (Task t : root.tasks){
			actionlist.add(t.action) 
		}
		return actionlist; }
}