package unidad1.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample2 {
	public static void main(String[] args) throws IOException { 
		Path p =  Paths.get("C://Escritorio//hola");
		if(Files.exists(p)) {
			System.out.println("Existe PATH");
			System.out.println("Es directorio : " + Files.isDirectory(p));
			System.out.println("Es file : " + Files.isRegularFile(p));
			
		}else {
			System.out.println("No existe");
			Files.createDirectories(p);
			
		}
		
		System.out.println("----------------");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)){
			for(Path r : stream) {
				System.out.println(r.getFileName());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("----------------");
	}
}
