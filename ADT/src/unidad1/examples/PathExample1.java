package unidad1.examples;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample1 {
	public static void main(String[] args) {
		Path dir = Paths.get(".");
		try {
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
				int count = 0;
				for(Path p :stream) {
					count ++;
				}
				System.out.printf("Ficheros en el directorio actual %d %n", count);
				try (DirectoryStream<Path> stream2 = Files.newDirectoryStream(dir)){
					for(Path p : stream2) {
						System.out.printf(
								"Nombre: %s, es fichero?: %b, es directorio?: %b %n",
								p.getFileName(),
								Files.isRegularFile(p),
								Files.isDirectory(p)
								
								);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
