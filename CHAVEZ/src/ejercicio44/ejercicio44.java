package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] dni = new int[4];

		for (int i = 0; i < 4; i++) { 

			System.out.println("inserte dni");
			dni[i] = entrada.nextInt();

		}

		for (int i = 0; i < 4; i++) {

			if (dni[i] % 2 == 0) {
				System.out.println(" el dni " + dni[i] + " es par: ");

			}

		}
	}

}
