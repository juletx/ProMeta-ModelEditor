package org.eclipse.xtext.uma

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.uma.generator.UmaSerializer

class UmaRuntimeModule extends AbstractGenericResourceRuntimeModule {

	override protected getFileExtensions() {
		'uma'
	}

	override protected getLanguageName() {
		LanguageConstants.ORG_ECLIPSE_XTEXT_UMA_UMA
	}

	def Class<? extends IGenerator2> bindIGenerator() {
		UmaSerializer
	}
}