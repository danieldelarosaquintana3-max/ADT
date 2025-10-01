package unidad1.examples;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathExampleTreeWalkDeleteDirectory {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\Users\\danie\\Desktop\\ACD");

        Files.walkFileTree(p, new FileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                // No se necesita hacer nada antes de visitar el directorio
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                // Eliminar el archivo
            	Files.delete(file);
            	System.out.println("File deleted " + file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                // Si falla al visitar el archivo, intentar eliminarlo de todas formas
            	Files.delete(file);
            	System.out.println("File deleted (coudnt get in)" + file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                // Eliminar el directorio después de que todos sus archivos hayan sido eliminados
            	Files.delete(dir);
            	System.out.println("Directory deleted " + dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
