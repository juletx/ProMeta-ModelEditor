package org.eclipse.xtext.uma.ui

import org.eclipse.xtext.uma.LanguageConstants
import org.eclipse.xtext.uma.ui.internal.UmaActivatorEx
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory

class UmaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory{
	override protected getBundle() {
		UmaActivatorEx.instance.bundle
	}

	override protected getInjector() {
		UmaActivatorEx.instance.getInjector(LanguageConstants.ORG_ECLIPSE_XTEXT_UMA_UMA)
	}
}