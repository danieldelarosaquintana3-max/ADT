package unidad2.examples;

import java.io.File;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class JavaXMLParserTest {
	public static void main(String[] args)  {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newDefaultInstance();
		try {
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document documento = builder.parse(new File("XMLPrueba.xml"));
			
			documento.normalize();
			
			NodeList bibliotecaNodeList  = documento.getElementsByTagName("libro");
			
			
			for(int i = 0 ; i  < bibliotecaNodeList.getLength(); i++) {
				
				NodeList nodeListLibro = bibliotecaNodeList.item(i).getChildNodes();
				System.out.println(bibliotecaNodeList.item(i));
				for (int j = 0; j < nodeListLibro.getLength(); j++) {
					System.out.println(nodeListLibro.item(j).getTextContent());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
