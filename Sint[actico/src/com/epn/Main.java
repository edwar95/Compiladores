package com.epn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		
		Archivo a = new Archivo();
		a.muestraContenido("hola.txt");
	
		a.Gdeclaracion();
		a.Gasignacion();
		 Runtime r = Runtime.getRuntime();

		 try {

		       String line;

		       Process p = r.exec

		         ("echo");

		       BufferedReader input =

		        new BufferedReader

		           (new InputStreamReader(p.getInputStream()));

		       while ((line = input.readLine()) != null) {

		         System.out.println(line);

		       }

		       input.close();

		     }

		     catch (Exception err) {

		       err.printStackTrace();

		     }

		   }
	}

	
	
