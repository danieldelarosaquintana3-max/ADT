package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {
    private static final String vowels = "AEIOUaeiou";

    public static void main(String[] args) throws IOException {
//    	var res =
//        Files.lines(Paths.get("C:\\Users\\danie\\Desktop\\test.txt"))
//            .flatMap(line -> Arrays.stream(line.split("")))
//            .filter(ch -> vowels.contains(ch))
//            .count();
//    	
//    	System.out.println(res);
    	
    	Path p = Paths.get("C:\\Users\\danie\\Desktop\\test.txt");
    	Files.lines(p)
    		.forEach(t -> System.out.println(t));
    }
}