/*
 * generated by Xtext 2.12.0
 */
package rover.missions.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import rover.missions.roverDSL.Robot

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RoverDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	val root = resource.allContents.head as Robot;
	if (root !== null) {
		var path = "generated/" + resource.getURI().lastSegment + "/"
		fsa.generateFile(path+"app.cpp", AppGenerator.toCpp(root))
		fsa.generateFile(path+"app.h", AppGenerator.toH(root))
		fsa.generateFile(path+"app.cfg", AppGenerator.toCfg(root))
		fsa.generateFile(path+root.mission.id+".cpp", MissionModuleGenerator.toModuleCpp(root))
		fsa.generateFile(path+root.mission.id+".h", MissionModuleGenerator.toModuleH(root))
		fsa.generateFile(path+"Makefile.inc", MakefileGenerator.toInc(root)) 
	} 
	
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
}
