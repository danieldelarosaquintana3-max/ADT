package actividades1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.file.Files;

/*
 * 	REG POS 0 = ID
 * 	
 * 
 */

public class Actividad3 {
	
	
	public static void main(String[] args) {
		int posReg = 0;
		
		int id = 12;
		StringBuilder apellido = new StringBuilder("de la Rosa");
		int departamento = 2000;
		Double salario =  2000.2D;
		
		try (RandomAccessFile raf = new RandomAccessFile(new File("test1.dat"), "rw")){
			
			if(raf.read() != 0) {
				raf.seek(posReg); 
				raf.writeInt(posReg);
				System.out.println(raf.getFilePointer());
				
				
				for(int i = 0; i < apellido.length(); i++) {
					raf.writeChar(apellido.charAt(i));
				}
				
				raf.writeInt(departamento);
				
				raf.writeDouble(salario);
			}
			else {
				
				raf.seek(0);
				id = raf.readInt();
				StringBuilder apellido1 = new StringBuilder();
				for(int i = 0;i < apellido.length(); i ++) {
					apellido1.append(raf.readChar());
				}
				departamento = raf.readInt();
				salario = raf.readDouble();
				
				System.out.printf("ID : %d , APELLIDO : %s , DEPARTAMENTO : %d , SALARIO : %f " ,id,apellido1,departamento,salario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
