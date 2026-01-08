import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteJAXB {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Persona.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			Persona p = new Persona("Daniel" , 19,1);
			marshaller.marshal(p, new File("Test.xml"));
			marshaller.marshal(p, System.out);
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch bloc	k
			e.printStackTrace();
		}
	}
}
