package ejercicio42;

import java.util.Scanner;

public class ejercicio42 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int[] numero = new int[3];

		int numeroAleatorio = (int) (Math.random() * 50);

		for (int i = 0; i < 3; i++) {

			System.out.print((i + 1) + ". Digite un numero: ");
			numero[i] = datos.nextInt();

			if (numero[i] == numeroAleatorio) {
				System.out.println(" Ganaste, el numero que le toco es: " + numero);
			}

			else {
				System.out.println("Le erraste. De nuevo. ");
			}

		}

	}
}