import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ReadJAXB {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Persona.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Persona personaleida = (Persona) unmarshaller.unmarshal(new File("Test.xml"));
			System.out.println(personaleida.getNombre());
			System.out.println(personaleida.getEdad());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
