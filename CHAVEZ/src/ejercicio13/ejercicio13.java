package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char talle, S, M, L;

		System.out.println("Ingrese su talle de remera: ");
		talle = entrada.next().charAt(0);

		if (talle == 'S' || talle == 's') {
		System.out.println("Quedan 5 remeras ");
		}

		if (talle == 'M' || talle == 'm') {
		System.out.println("Quedan 2 remeras ");
		}

		if (talle == 'L' || talle == 'l') {
		System.out.println("No quedan remeras ");
		}





		}
		}

