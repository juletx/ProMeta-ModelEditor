package org.eclipse.epf.uma.xslt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;

public class Xmi2Uma {
	public static List<File> getXmiFiles(String directoryName) {
		File directory = new File(directoryName);
		List<File> files = new ArrayList<File>();
		File[] fList = directory.listFiles();
		if (fList != null) {
			for (File file : fList) {
				if (file.isFile()) {
					if (getExtension(file).equals("xmi")) {
						files.add(file);
					}
				} else if (file.isDirectory()) {
					files.addAll(getXmiFiles(file.getAbsolutePath()));
				}
			}
		}
		return files;
	}
	
	public static String getExtension(File file) {
		String fileName = file.getAbsolutePath();
		String extension = "";
		int i = fileName.lastIndexOf('.');
		if (i != -1) {
		    extension = fileName.substring(i+1);
		}
		return extension;
	}
	
	public static String getRelativePath(File file, String dir) {
		return new File(dir).toURI().relativize(file.toURI()).getPath();
	}

	public static void main(String[] args) {
		String projectDir = System.getProperty("user.dir");
		String inputDir = projectDir + "\\org.eclipse.epf.library\\";
		String outputDir = projectDir + "\\org.eclipse.platform.ide\\org.eclipse.epf.openup.uma\\src\\";
		try {
			TransformerFactory factory = new TransformerFactoryImpl();
			Source xslt = new StreamSource(new File("xslt/Xmi2Uma.xslt"));
			Transformer transformer = factory.newTransformer(xslt);

			List<File> files = getXmiFiles(inputDir);
			
			for (File inputFile : files) {
				String relativePath = getRelativePath(inputFile, inputDir);
				relativePath = relativePath.replace(".xmi", ".uma");
				String outputPath = outputDir + relativePath;
				File outputFile = new File(outputPath);
				Source text = new StreamSource(inputFile);
				transformer.transform(text, new StreamResult(outputFile));
			}
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} finally {

		}
	}
}
