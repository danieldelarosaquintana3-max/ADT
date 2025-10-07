package Tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException{ 
		
		File f = new File("C:\\Users\\danie\\Desktop\\test.txt");
		FileReader f2 = new FileReader(f) ;
		
		int i;
		while((i = f2.read()) != -1) {
			System.out.println((char) i);
		}
		
	}
}
