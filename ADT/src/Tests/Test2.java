package Tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {
    	String d = "test.txt";
    	try(FileOutputStream fo = new FileOutputStream(d,true)) {
    		for(int i = 0; i< 10;i++) {
    			fo.write(i);
    		}
    		try (FileInputStream fi = new FileInputStream(d)){
    			int m;
				while((m = fi.read())!= -1) {
					System.out.println(m);
				}
			} 
    	}catch (Exception e) {
			// TODO: handle exception
		}
    }
}