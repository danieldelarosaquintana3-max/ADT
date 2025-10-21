package Tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {

    public static void main(String[] args) throws IOException {
    	PrintWriter pw = new PrintWriter(new File("test.txt"));
    	pw.println("AAAAAA");
    	pw.println("AAAAAA");
    	pw.println("AAAAAA");
    	pw.flush();
    }
}