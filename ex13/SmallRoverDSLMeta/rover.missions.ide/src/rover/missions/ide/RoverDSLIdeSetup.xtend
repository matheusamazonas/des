/*
 * generated by Xtext 2.12.0
 */
package rover.missions.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import rover.missions.RoverDSLRuntimeModule
import rover.missions.RoverDSLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RoverDSLIdeSetup extends RoverDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RoverDSLRuntimeModule, new RoverDSLIdeModule))
	}
	
}
