package Tests;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerializableByteTransformationTest {
	public static void main(String[] args) throws Exception {
			ArrayList<Persona> arrp = new ArrayList<Persona>();
			
			for(int i = 0;i <= 10; i++) {
				Persona p = new Persona("Persona " + i, i + 10);
				arrp.add(p);
			}
			
			FileOutputStream fo = new FileOutputStream("test1.dat");
			try (MiObjectOutputStream obp = new MiObjectOutputStream(fo,false)) {
				arrp.forEach(t -> {
					try {
						obp.writeObject(t);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
			}
			
			FileInputStream fip = new FileInputStream("test1.dat");
		try (ObjectInputStream obi = new ObjectInputStream(fip)){
			Object m = null;
			
			while (true) {
		        try {
		             m = obi.readObject();
		            Persona persona = (Persona) m;
		            System.out.println(m.toString());
		        } catch (EOFException eof) {
		            break; // Fin del archivo, salir del bucle
		        }
		    }

		}catch (Exception e2) {
			// TODO: handle exception	}
			e2.printStackTrace();
		}
	}
}
