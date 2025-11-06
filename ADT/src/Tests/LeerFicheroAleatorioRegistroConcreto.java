package Tests;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;

public class LeerFicheroAleatorioRegistroConcreto {
	
    public static void main(String[] args) {
		try (RandomAccessFile ra = new RandomAccessFile(new File("test.txt"), "rw")) {
			ra.seek(1);
			ra.writeInt(1);
			
			StringBuffer buffer = new StringBuffer("Holaa");
			
			
			
			
			ra.seek(2);
			ra.writeChars(buffer.toString());
			
			ra.seek(2);
			System.out.println(ra.readLine());
			
			ra.seek(5 * 10);
			ra.writeInt(10);
			ra.seek(50);
			System.out.println(ra.readInt());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
