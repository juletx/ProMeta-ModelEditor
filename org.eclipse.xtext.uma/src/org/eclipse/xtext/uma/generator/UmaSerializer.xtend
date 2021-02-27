package org.eclipse.xtext.uma.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.epf.uma.MethodLibrary

import static extension org.eclipse.emf.common.util.URI.createPlatformResourceURI

class UmaSerializer extends AbstractGenerator {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		serialize(input.toOutputURI, (input.contents.head as MethodLibrary))
	}

	private def serialize(URI outputURI, MethodLibrary methodLibrary) {
		val resource = new XtextResourceSet().createResource(outputURI)
		resource.contents += methodLibrary
		resource.save(newHashMap)
	}

	private def toOutputURI(Resource input) {
		val inputUri = input.URI
		val outputUri = inputUri.trimFileExtension.appendFileExtension("umal")
		var outputPath = outputUri.toPlatformString(true)
		outputPath.createPlatformResourceURI(true)
	}

}