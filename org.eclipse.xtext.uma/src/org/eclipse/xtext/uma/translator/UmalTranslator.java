package org.eclipse.xtext.uma.translator;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.uma.UmalStandaloneSetup;

import com.google.inject.Injector;

import org.eclipse.epf.uma.UmaPackage;

public class UmalTranslator {
	public static void main(String[] args) throws Exception {
		UmaPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("uma", new XMIResourceFactoryImpl());
		
		Injector injector = new UmalStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		
		String directory = "C:\\Users\\julet\\GitHub\\ProMeta-ModelEditor\\org.eclipse.platform.ide\\org.eclipse.epf.openup.umal\\src";
		String inputURI = "file:///" + directory + "/openup.uma";
		String outputURI = "file:///" + directory + "/openup.umal";
		
		Resource resource = resourceSet.getResource(URI.createURI(inputURI), true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
		xmiResource.getContents().add(resource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}