package tp_integrador;

import java.util.Scanner;

public class tp_integrador {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] filaA = { 1, 2, 3 };
		int[] filaB = { 1, 2, 3 };
		int[] filaC = { 1, 2, 3 };
		int[] filaD = { 1, 2, 3 };
		boolean[] ocuA = { false, false, false };
		boolean[] ocuB = { false, false, false };
		boolean[] ocuC = { false, false, false };
		boolean[] ocuD = { false, false, false };
		
		
		int numasientos;
		System.out.println("hola, como estas? que fila queres del cine: ");
		String filas = datos.next();

		switch (filas.toLowerCase()) {

		case "a":
			System.out.println("numero de asiento ingresar:  ");
			numasientos = datos.nextInt();

			while (ocuA[numasientos - 1]) {
				System.out.println("el asiento esta ocupado. ingrese otro numero:");
				numasientos = datos.nextInt();

			}
			if (ocuA[numasientos - 1] == false) {
				System.out.println("el asiento numero " + filaA[numasientos - 1] + " esta ocupado de la fila A");
				ocuA[numasientos - 1] = true;
			}
			 break;
		case "b":
			System.out.println("numero de asiento ingresar:  ");
			numasientos = datos.nextInt();

			while (ocuB[numasientos - 1]) {
				System.out.println("el asiento esta ocupado. ingrese otro numero:");
				numasientos = datos.nextInt();

			}
			if (ocuB[numasientos - 1] == false) {
				System.out.println("el asiento numero " + filaB[numasientos - 1] + " esta ocupado de la fila B");
				ocuB[numasientos - 1] = true;
			}
			 break;

		case "c":
			System.out.println("numero de asiento ingresar:  ");
			numasientos = datos.nextInt();

			while (ocuC[numasientos - 1]) {
				System.out.println("el asiento esta ocupado. ingrese otro numero:");
				numasientos = datos.nextInt();

			}
			if (ocuC[numasientos - 1] == false) {
				System.out.println("el asiento numero " + filaC[numasientos - 1] + " esta ocupado de la fila C");
				ocuC[numasientos - 1] = true;
			}
			break;
		case "d":
			System.out.println("numero de asiento ingresar:  ");
			numasientos = datos.nextInt();

			while (ocuD[numasientos - 1]) {
				System.out.println("el asiento esta ocupado. ingrese otro numero:");
				numasientos = datos.nextInt();

			}
			if (ocuD[numasientos - 1] == false) {
				System.out.println("el asiento numero " + filaD[numasientos - 1] + " esta ocupado de la fila D");
				ocuD[numasientos - 1] = true;
			}
			break;
		   default:
			System.out.println("es una opcion incorrecta ");
		}

	}

}
