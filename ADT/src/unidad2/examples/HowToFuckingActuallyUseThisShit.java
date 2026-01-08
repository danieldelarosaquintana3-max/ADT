package unidad2.examples;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;




public class HowToFuckingActuallyUseThisShit {
	public static void main(String[] args) {
		SAXParserFactory parseFactory = SAXParserFactory.newDefaultInstance();
		parseFactory.setNamespaceAware(true);
		
		
		try {
			SAXParser parser = parseFactory.newSAXParser();
			XMLReader procesadorXML = parser.getXMLReader();
			
			GestionContenido gestor = new GestionContenido();
			procesadorXML.setContentHandler(gestor);
			
			InputSource fileXML = new InputSource("XMLPrueba.xml");
			procesadorXML.parse(fileXML);
			
			
			
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class GestionContenido extends DefaultHandler {
	GestionContenido() {
		super();
	}
}


