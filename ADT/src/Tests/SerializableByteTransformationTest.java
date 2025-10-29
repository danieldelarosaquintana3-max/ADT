package Tests;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableByteTransformationTest {
	public static void main(String[] args) throws Exception {
		ArrayList<Persona> arrp = new ArrayList<Persona>();
		
		for(int i = 0;i <= 10; i++) {
			Persona p = new Persona("Persona " + i, i + 10);
			arrp.add(p);
		}
		
		FileOutputStream fo = new FileOutputStream("test.txt");
		try (ObjectOutputStream obp = new ObjectOutputStream(fo)) {
			arrp.forEach(t -> {
				try {
					obp.writeObject(t);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		
		FileInputStream fip = new FileInputStream("test.txt");
	try (ObjectInputStream obi = new ObjectInputStream(fip)){
		Object m;
		while ((m = obi.readObject())!= null) {
			System.out.println(m);
		}
	}
	}
}
