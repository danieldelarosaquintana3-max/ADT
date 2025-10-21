package Tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) { 
		File f = new File("Test.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
