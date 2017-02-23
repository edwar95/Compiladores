package com.epn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Archivo {
	public String aux = "", cadena, aux1 = "";

	public void muestraContenido(String archivo) throws FileNotFoundException,
			IOException {

		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {

			aux = aux + cadena + "\n";
		}
		// String aux="";

		// System.out.println(aux);

		b.close();
	}

	public void Gdeclaracion() throws FileNotFoundException, IOException {
		String ruta = "archivo.txt";
		String palabra = "";
		int i = 0;
		File archivo = new File(ruta);
		BufferedWriter bw;
		bw = new BufferedWriter(new FileWriter(archivo));
		String gool = null;
		StringTokenizer token2 = new StringTokenizer(aux, "\n");

		while (token2.hasMoreElements()) {
			gool = token2.nextToken();
			StringTokenizer token3 = new StringTokenizer(gool, " ");
			palabra = token3.nextToken();
			if (palabra.compareTo("int") == 0) {
				String h = token3.nextToken();
				bw.write("r" + i + " = " + h + "\n");
				System.out.println("Store " + h + " => r" + i);
			}
			i++;
		}
		bw.close();
	}

	public void Gasignacion() throws FileNotFoundException, IOException {
		String ruta = "tabla.txt";
		File archivo = new File(ruta);
		BufferedWriter bw;
		bw = new BufferedWriter(new FileWriter(archivo));
		aux = "";
		FileReader f = new FileReader("archivo.txt");
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			// System.out.println(cadena);
			aux = aux + cadena + "\n";
		}
		b.close();
		// System.out.print(aux);
		FileReader f1 = new FileReader("hola.txt");
		BufferedReader b1 = new BufferedReader(f1);
		while ((cadena = b1.readLine()) != null) {
			// System.out.println(cadena);
			aux1 = aux1 + cadena + "\n";
		}
		b1.close();
		// System.out.print(aux1);
		String key[] = new String[20];
		String auz[] = new String[20];
		String palabra;
		StringTokenizer token3 = new StringTokenizer(aux1, "\n");
		while (token3.hasMoreElements()) {
			palabra = token3.nextToken();
			StringTokenizer token4 = new StringTokenizer(palabra, " ");
			for (int y = 0; y < 20; y++) {
				auz[y] = "";
			}
			int j = 0;
			while (token4.hasMoreElements()) {
				auz[j] = "" + token4.nextToken();
				j++;
			}
			if (auz[0].compareTo("main") == 0) {
				System.out.print("\nMain: \n");
			}
			if (auz[0].compareTo("if") == 0) {

				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[2]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l2 = token2.nextToken();
					}
				}

				System.out.print("\nbeq " + l1 + "," + l2 + " IF \n");
				System.out.print("\nIf: \n");
			}

			if (auz[1].compareTo("=") == 0 && auz[3].compareTo(";") == 0) {
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();

					StringTokenizer token2 = new StringTokenizer(lexema, " ");

					int k = 0;

					while (token2.hasMoreElements()) {
						key[k] = "" + token2.nextToken();
						k++;
					}

					if (key[2].compareTo(auz[0]) == 0) {
						bw.write("" + key[0] + " " + key[2] + " " + auz[2]
								+ "\n");
						System.out.print("\nLoadI " + auz[2] + " => " + key[0]
								+ "\n");
					}
				}

			}
			if (auz[3].compareTo("+") == 0 && !isNumeric(auz[4])) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nadd " + l2 + "," + l3 + " =>" + l1);
			}
			if (auz[3].compareTo("-") == 0 && (!(isNumeric(auz[2])))
					&& (!(isNumeric(auz[4])))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nsub " + l2 + "," + l3 + " =>" + l1);
			}
			if (auz[3].compareTo("*") == 0 && (!(isNumeric(auz[2])))
					&& (!(isNumeric(auz[4])))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				System.out.print(key[1]);
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nmult " + l2 + "," + l3 + " =>" + l1);
			}
			if (auz[3].compareTo("/") == 0 && (!(isNumeric(auz[2])))
					&& (!(isNumeric(auz[4])))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\ndiv " + l2 + "," + l3 + " =>" + l1);
			}
			if (auz[3].compareTo("+") == 0 && (isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\naddI " + l2 + "," + auz[4] + " =>" + l1);

			}
			if (auz[3].compareTo("-") == 0 && (isNumeric(auz[4]))
					&& (!(isNumeric(auz[2])))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nsubI " + l2 + "," + auz[4] + " =>" + l1);

			}
			if (auz[3].compareTo("-") == 0 && (isNumeric(auz[2]))
					&& !(isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nRsubI " + auz[2] + "," + l3 + " =>" + l1);

			}
			if (auz[3].compareTo("*") == 0 && (isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nmultI " + l2 + "," + auz[4] + " =>" + l1);

			}
			if (auz[3].compareTo("/") == 0 && (isNumeric(auz[4]))
					&& (!(isNumeric(auz[2])))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\ndivI " + l2 + "," + auz[4] + " =>" + l1);

			}
			if (auz[3].compareTo("/") == 0 && (isNumeric(auz[2]))
					&& !(isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nRdivI " + auz[2] + "," + l3 + " =>" + l1);

			}

			if (auz[3].compareTo("<<") == 0 && !(isNumeric(auz[2]))
					&& !(isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nlshift " + l2 + "," + l3 + " =>" + l1);

			}
			if (auz[3].compareTo(">>") == 0 && !(isNumeric(auz[2]))
					&& !(isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nrshift " + l2 + "," + l3 + " =>" + l1);

			}
			if (auz[3].compareTo("<<") == 0 && !(isNumeric(auz[2]))
					&& (isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nlshiftI " + l2 + "," + auz[4] + " =>" + l1);

			}
			if (auz[3].compareTo(">>") == 0 && !(isNumeric(auz[2]))
					&& (isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nrshiftI " + l2 + "," + auz[4] + " =>" + l1);

			}
			if (auz[3].compareTo("||") == 0 && !(isNumeric(auz[2]))
					&& !(isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nand " + l2 + "," + l3 + " =>" + l1);

			}
			if (auz[3].compareTo("||") == 0 && !(isNumeric(auz[2]))
					&& !(isNumeric(auz[4]))) {
				int k = 0;
				String aux3 = "";
				StringTokenizer token = new StringTokenizer(aux, "\n");
				while (token.hasMoreElements()) {
					String lexema = token.nextToken();
					StringTokenizer token2 = new StringTokenizer(lexema, " = ");
					aux3 = token2.nextToken();
					String aux4 = token2.nextToken();
					key[k] = "" + aux4 + ";" + aux3;
					k++;

				}
				String l1 = " ", l2 = " ", l3 = " ";
				int r = Integer.parseInt("" + aux3.charAt(1));
				for (int y = 0; y < r; y++) {
					StringTokenizer token2 = new StringTokenizer(key[y], ";");
					String hola = token2.nextToken();
					if (hola.compareTo(auz[0]) == 0) {
						l1 = token2.nextToken();
					}
					if (hola.compareTo(auz[2]) == 0) {
						l2 = token2.nextToken();
					}
					if (hola.compareTo(auz[4]) == 0) {
						l3 = token2.nextToken();
					}
				}
				System.out.print("\nand " + l2 + "," + l3 + " =>" + l1);

			}
		}
		bw.close();
	}

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}
