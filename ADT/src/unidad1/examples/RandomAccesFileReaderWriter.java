package unidad1.examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFileReaderWriter {
	public static void main(String[] args) {
		try (RandomAccessFile r = new RandomAccessFile("test.txt", "rw");){
			String s = r.readLine();
			
			System.out.println(s);
//			r.writeChar('a'); //Writing char 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
