package Tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test1 {
	public static void main(String[] args) { 
		
		Path p = Paths.get("C:\\Users\\danie\\Desktop\\test.txt");
//		String line;
//		
//		try(BufferedReader bf = Files.newBufferedReader(p)) {
//			while((line = bf.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		String s = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = bf.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try (BufferedWriter bw = Files.newBufferedWriter(p)){
			bw.write(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
