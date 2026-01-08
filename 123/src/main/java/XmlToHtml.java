import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlToHtml {
    public static void main(String[] args) throws Exception {
        Source xmlSource = new StreamSource(new File("Test.xml"));
        Source xsltSource = new StreamSource(new File("plantilla.xsl"));
        Result result = new StreamResult(new File("salida.html"));

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(xsltSource);

        transformer.transform(xmlSource, result);

        System.out.println("HTML generado: salida.html");
        
    }
}

