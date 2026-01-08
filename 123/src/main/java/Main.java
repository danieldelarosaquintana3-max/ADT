import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {
	public static void main(String[] args) {
		
		try {
			ArrayList<Persona> p = new ArrayList<>();
			
			p.add(new Persona("Javier" , 20,1));
			p.add(new Persona("Daniel" , 19,2));
			
			
			Personas p3 = new Personas(p);
			
			JAXBContext context = JAXBContext.newInstance(Personas.class);
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(p3, new File("Test.xml"));
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
