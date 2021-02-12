/*
 * generated by Xtext 2.24.0
 */
package org.eclipse.xtext.uma.generator

import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.epf.uma.UmaPackage
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.uma.UmalStandaloneSetup

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UmalGenerator extends AbstractGenerator {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		serialize(input, fsa)
	}

	def serialize(Resource input, IFileSystemAccess2 fsa) {
		UmaPackage.eINSTANCE.eClass()
		
		val reg = Resource.Factory.Registry.INSTANCE
		val m = reg.getExtensionToFactoryMap()
		m.put("uma", new XMIResourceFactoryImpl())
		
		val injector = new UmalStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(ResourceSet)
		
		val inputUri = input.URI
		val outputUri = inputUri.trimFileExtension.appendFileExtension('uma')
		val directory = "C:\\Users\\julet\\GitHub\\ProMeta-ModelEditor\\org.eclipse.platform.ide"
		var outputPath = outputUri.toPlatformString(true)
		outputPath = "file:///" + directory + outputPath;
		
		input.load(null);
		EcoreUtil.resolveAll(resourceSet)
		
		val xmiResource = resourceSet.createResource(URI.createURI(outputPath))
		xmiResource.getContents().add(input.getContents().get(0))
		try {
			xmiResource.save(null)
		} catch (IOException e) {
			e.printStackTrace()
		}
	}
}
