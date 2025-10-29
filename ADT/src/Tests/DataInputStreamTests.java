package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamTests {
	public static void main(String[] args) {
//		try {
//			DataInputStream dt = new DataInputStream(new FileInputStream("test.txt"));
//			String s ;
//			while((s = dt.readLine()) != null) {
//				System.out.println(s);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			FileOutputStream fp = new FileOutputStream("test1.dat");
			String s = "Holaaa";
			byte[] b = s.getBytes();
			fp.write(b);
			fp.flush();
			
			FileInputStream fpi = new FileInputStream("test1.dat");
			byte[] r;
			while(( r = fpi.readAllBytes()) != null) {
				System.out.println(r);
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
