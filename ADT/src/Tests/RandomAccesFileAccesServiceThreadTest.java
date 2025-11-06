package Tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RandomAccesFileAccesServiceThreadTest {
	private	ExecutorService services;
	
	RandomAccesFileAccesServiceThreadTest (ObjectOutputStream obt) {
		services = Executors.newFixedThreadPool(10);
		addPerson(obt);
	}
	
	public void addPerson(ObjectOutputStream obt) {
		services.submit(() -> {
			try {
				Persona p = new Persona("Daniel" , 18);
				//obt.writeObject(p);
				System.out.println(p.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	public static void main(String[] args) {
		
		try (ObjectOutputStream obt = new ObjectOutputStream(new FileOutputStream(new File("test.txt")))){
			RandomAccesFileAccesServiceThreadTest rast  = new RandomAccesFileAccesServiceThreadTest(obt);
			rast.services.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

