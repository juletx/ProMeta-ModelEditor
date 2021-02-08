/*
 * generated by Xtext 2.24.0
 */
package org.xtext.epf.uma.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.epf.uma.UmaRuntimeModule;
import org.xtext.epf.uma.UmaStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class UmaIdeSetup extends UmaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new UmaRuntimeModule(), new UmaIdeModule()));
	}
	
}
