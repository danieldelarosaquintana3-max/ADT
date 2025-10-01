package Tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("C:\\Users\\danie\\Desktop\\arp.txt"));
		String s;
		while((s = sc.nextLine() )!= null) {
			System.out.println(s);
		}
	}
	
}
