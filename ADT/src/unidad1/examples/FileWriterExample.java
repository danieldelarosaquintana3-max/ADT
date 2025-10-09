package unidad1.examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		File f =  new File("test.txt");
		String text = "Hola mundo!";
		char[] buffchar = text.toCharArray();
		try(FileWriter fw =  new FileWriter(f)){
			fw.write(buffchar);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		try (FileReader fr = new FileReader(f)){
			
			int i;
			
			while((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
