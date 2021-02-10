package org.eclipse.epf.openup.xslt;

import java.io.File;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;

public class XmlToUma {
	public static void main(String[] args) {
		String dir = "files/";
		try {
			TransformerFactory factory = new TransformerFactoryImpl();
			Source xslt = new StreamSource(new File(dir + "openup.xslt"));
			Transformer transformer = factory.newTransformer(xslt);

			Source text = new StreamSource(new File(dir + "openup.xml"));
			dir = "C:\\Users\\julet\\GitHub\\ProMeta-ModelEditor\\org.eclipse.platform.ide\\org.eclipse.epf.openup\\";
			transformer.transform(text, new StreamResult(new File(dir + "openup.uma")));
		}
		catch(TransformerConfigurationException e) {
			e.printStackTrace();
		}
		catch(TransformerException e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
}
