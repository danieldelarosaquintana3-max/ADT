package actividades1_1;

import java.io.File;
import java.io.FileReader;

public class Actividad2 {
	public static void main(String[] args) {
		File f =  new File("test.txt");
		
		if(!f.exists() || f.isDirectory()) {
			System.out.println(f.exists()?"ES UN DIRECTORIO":"FILE NO EXISTE");
		}else {
			try(FileReader fr =  new FileReader(f)){
				int c;
				while((c = fr.read())!= -1) {
					System.out.print((char) c);
				}
			}catch (Exception e) {
			}
		}
		
	}
}
