/*
 * generated by Xtext 2.12.0
 */
package gameOfLife.ide

import com.google.inject.Guice
import gameOfLife.DSLRuntimeModule
import gameOfLife.DSLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DSLIdeSetup extends DSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DSLRuntimeModule, new DSLIdeModule))
	}
	
}
