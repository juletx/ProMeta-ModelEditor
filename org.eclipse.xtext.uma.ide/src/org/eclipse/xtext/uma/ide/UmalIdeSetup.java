/*
 * generated by Xtext 2.24.0
 */
package org.eclipse.xtext.uma.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.uma.UmalRuntimeModule;
import org.eclipse.xtext.uma.UmalStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class UmalIdeSetup extends UmalStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new UmalRuntimeModule(), new UmalIdeModule()));
	}
	
}
