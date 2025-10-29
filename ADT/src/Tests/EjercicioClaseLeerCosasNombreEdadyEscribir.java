package Tests;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class EjercicioClaseLeerCosasNombreEdadyEscribir {
	public static void main(String[] args) {
		try {
			HashMap<String, Integer> hs = new HashMap<String, Integer>();
			hs.put("Daniel", 18);
			hs.put("Javier", 20);
			DataInputStream dt = new DataInputStream(new FileInputStream("test.txt"));
			DataOutputStream dto = new DataOutputStream(new FileOutputStream("test.txt"));
			hs.forEach((t, u) -> {
				try {
					dto.writeUTF(String.format("%s %s%n", t, u));
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
