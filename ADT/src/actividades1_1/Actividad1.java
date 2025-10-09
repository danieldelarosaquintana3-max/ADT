package actividades1_1;

import java.io.File;

public class Actividad1 {
	public static void main(String[] args) {
		File f = new File(".");
		
		if(!f.exists()) {
			System.out.println("DIRECTORIO INEXISTENTE");
		}else {
			String [] m = f.list();
			
			for(String s: m) {
				System.out.println(s);
			}
		}
	}
}
