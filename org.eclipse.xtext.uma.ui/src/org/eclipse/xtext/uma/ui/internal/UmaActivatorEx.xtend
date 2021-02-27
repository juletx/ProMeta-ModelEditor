package org.eclipse.xtext.uma.ui.internal

import org.eclipse.xtext.uma.UmaRuntimeModule
import org.eclipse.xtext.uma.ui.UmaUiModule
import org.eclipse.xtext.uma.LanguageConstants

class UmaActivatorEx extends UmaActivator {

	override getRuntimeModule(String grammar) {
		if (grammar.isUmaLanguage) {
			return new UmaRuntimeModule
		}
		super.getRuntimeModule(grammar)
	}

	override getUiModule(String grammar) {
		if (grammar.isUmaLanguage) {
			return new UmaUiModule(this)
		}
		super.getUiModule(grammar)
	}

	private def isUmaLanguage(String grammar){
		LanguageConstants.ORG_ECLIPSE_XTEXT_UMA_UMA.equals(grammar)
	}
}