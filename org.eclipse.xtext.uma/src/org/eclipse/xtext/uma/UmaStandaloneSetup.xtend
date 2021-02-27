package org.eclipse.xtext.uma

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.resource.FileExtensionProvider
import com.google.inject.Inject
import org.eclipse.xtext.resource.IResourceServiceProvider
import com.google.inject.Guice

/**
 * This class is needed for standalone runtime tests.
 */
class UmaStandaloneSetup implements ISetup {

	@Inject extension FileExtensionProvider
	@Inject extension IResourceServiceProvider.Registry
	@Inject IResourceServiceProvider resourceServiceProvider

	override createInjectorAndDoEMFRegistration() {
		val injector = Guice.createInjector(new UmaRuntimeModule)

		injector.injectMembers(this)

		fileExtensions.forEach[extensionToFactoryMap.put(it, resourceServiceProvider)]

		injector
	}

}