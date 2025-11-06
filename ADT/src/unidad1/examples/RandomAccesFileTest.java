package unidad1.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;

public class RandomAccesFileTest {
	
	public static void main(String[] args) {
		try (RandomAccessFile raf = new RandomAccessFile(new File("test.txt"),"r")){
			String s;
			while((s = raf.readLine()) != null) {
				System.out.println(s);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
