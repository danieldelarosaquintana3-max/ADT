package unidad1.exercises;

import java.io.File;

public class ExerciseFileChecking {
	
	
	
	public static void main(String[] args) {
		int x = 0;
		if(args.length != 1) {
			System.out.println("Pon un argumento");
			System.exit(0);
		}
		
		String dir = args[0];
		File f =  new File(dir);
		
		busquedaRecursivaFiles(f,x);
		
//		if(!f.exists()) {
//			System.out.println("FICHERO NO EXISTE");
//			System.exit(0);
//		}else {
//			for(File s : f.listFiles()) {
//				System.out.println(s.getName());
//				if(s.isDirectory()) {
//					System.out.println(s);
//					for(File s1 : s.listFiles()) {
//						System.out.println("--->" +s1);
//					}
//				}else {
//					System.out.println("-----------------");
//					System.out.println(s);
//				}
//
//				
//			}
//		}
		
		
	}
	public static void busquedaRecursivaFiles(File f1 ,int x) {

		for(File f: f1.listFiles()) {
			if(f.isFile()) {
					System.out.println(f + "---->" + x);
			}else {
				x++;
				System.out.println("-----> " + f);
				busquedaRecursivaFiles(f, x);
			}
			System.out.println("-----------------");
			
		}
		x= 0;
	}
}
