package actividades1_1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class EscribirFichAleatorioUnRegAlFinal {
	public static void main(String[] args) {
		try (RandomAccessFile ra = new RandomAccessFile(new File("test1.dat"), "rw")) {
			int registro = 0;
			ra.seek(registro);
			int id = ra.readInt() ;
			if (id != 0) {
				ArrayList<Character> apellido = new ArrayList<>();
				try {
				    for(int i = 0;i <6 ; i++) {
				        apellido.add(ra.readChar());
				    }
				   
				} catch (IOException e) {
				    e.printStackTrace(); 
				}
				
				
			}else {
				throw new IllegalArgumentException("No existe nada en este registro");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
