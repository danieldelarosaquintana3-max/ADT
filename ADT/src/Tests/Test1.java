package Tests;

import java.io.File;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException { 
		File f =  new File("C://");
		File[] directorios = f.listFiles();
		for(int i = 0; i < directorios.length ; i++) {
			System.out.println(directorios[i]);;
		}
	}
}
