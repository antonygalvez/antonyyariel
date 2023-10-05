package ejercicio34;

import java.util.Scanner;

public class ejercicio34 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ingresos = 0;

		for (int i = 1; i <= 12; i++) {

			System.out.println("Coloque los ingresos del ultimo mes: " + i);
			ingresos = entrada.nextInt();

			if (ingresos < 100000) {

				System.out.println("Hubo un ingreso menor  a 100000 en un mes ");
				System.out.println("En el mes numero: " + i);

			}

		}

	}
}
