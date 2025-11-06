package Tests;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;

public class LeerFicheroAleatorioRegistroConcreto {
	
    public static void main(String[] args) {
    	int posicion = 5;
    	
    	int registro = (posicion -1 ) * 36;
    	
		try (RandomAccessFile ra = new RandomAccessFile(new File("test1.dat"), "rw")) {

			ra.seek(0);
			
			ra.writeInt(posicion);
			StringBuffer apellidos = new StringBuffer("Urcera");
			
			apellidos.setLength(apellidos.length());
			ra.writeChars(apellidos.toString());
			ra.writeInt(15);
			ra.writeDouble(22.13);
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
