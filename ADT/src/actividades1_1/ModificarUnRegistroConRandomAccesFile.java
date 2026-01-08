package actividades1_1;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

/*
 * PRIMER REGISTRO SEEK 0 INT
 * SEGUNDO APELLIDO CHAR LENGTH 6
 * TERCERO DEPARTAMENTO INT
 * DOUBLE SALARIO
 * 
 */

public class ModificarUnRegistroConRandomAccesFile {
	
	public static void main(String[] args) {
		
		
		try (RandomAccessFile ra = new RandomAccessFile(new File("test1.dat"), "rw")){
		
			ra.seek(0);
			
		
			int id = ra.readInt();
			
			StringBuilder apellidos = new StringBuilder();
			
			for (int i = 0; i < 6 ; i++) {
				apellidos.append(ra.readChar());
			}
			
			int departamento = ra.readInt();

			Double salario = ra.readDouble();
			
			System.out.printf("ID : %d , APELLIDOS : %s , DEPARTAMENTO : %d , SALARIO : %f",id ,apellidos ,departamento ,salario);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
