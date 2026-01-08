package Tests;

import java.io.File;
import java.io.RandomAccessFile;
/*
 * PRIMER REGISTRO SEEK 0 INT
 * SEGUNDO APELLIDO CHAR LENGTH 6
 * TERCERO DEPARTAMENTO INT
 * DOUBLE SALARIO
 * 
 */
public class FileChannelTesting {
	public static void main(String[] args) {
		
		try (RandomAccessFile raf = new RandomAccessFile(new File("test1.dat"), "rw")){
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
