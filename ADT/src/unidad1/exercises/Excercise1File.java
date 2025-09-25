package unidad1.exercises;

import java.io.File;

public class Excercise1File {
	public static void main(String[] args) {
		File x =  new File("\\hola");
		if(x.exists()) {
			System.out.println("Directorio existe");
			System.out.println("Directorio absoluto: " + x.getAbsolutePath());
		}else {
			try {
				System.out.println("No existe");
				x.createNewFile();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
