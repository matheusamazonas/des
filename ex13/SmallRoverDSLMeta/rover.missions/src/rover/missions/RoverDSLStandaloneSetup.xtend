/*
 * generated by Xtext 2.12.0
 */
package rover.missions


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RoverDSLStandaloneSetup extends RoverDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new RoverDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
