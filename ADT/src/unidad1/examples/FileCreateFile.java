package unidad1.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreateFile {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("");
		try {
			if(!Files.exists(p)) {
				Files.createDirectories(p);
			}else {
				System.out.println("Directorio ya existe");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Path p1 =  Paths.get("test.txt");
		try {
			if(!Files.exists(p1)) {
				Files.createFile(p1);
			}else {
				System.out.println("File ya existe");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
	}
	
}
