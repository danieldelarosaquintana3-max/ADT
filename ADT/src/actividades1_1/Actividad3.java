package actividades1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class Actividad3 {
	public static void main(String[] args) {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String text = br.readLine();
			String [] textS = text.split(" ");
			try {
				File f = new File("test.txt");
				FileWriter fw = new FileWriter(f);
				
				int id = Integer.parseInt(textS[0]);
				String apellido = textS[1];
				int departamento = Integer.parseInt(textS[2]);
				double salario =  Double.parseDouble(textS[3]);
				
				StringBuilder sb = new StringBuilder();

				sb.append(id + " ");
				sb.append(apellido + " ");
				sb.append(departamento + " ");
				sb.append(salario);
				
				fw.write(sb.toString());
				fw.flush();
				
				
			} catch (Exception e) {
				System.out.println("Valor mal puesto");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
