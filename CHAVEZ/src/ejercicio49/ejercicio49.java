package ejercicio49;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio49 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		System.out.println("Cantidad de DNI: ");
		int cantidad = datos.nextInt();
		int[] DNI = new int[cantidad];
		
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("Ingresar una lista de DNIs: ");
			DNI[i] = datos.nextInt();

		}

		System.out.println("\nDNI ordenado ascendente");
		Arrays.sort(DNI);
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("DNI ASCENDENTE: " + DNI[i]);
		}

		System.out.println("\nDNI ordenado descendente");
		for (int i = DNI.length - 1; i >= 0; i--) {
			System.out.println("DNI DESCENDENTE: " + DNI[i]);
		}
	}
}
