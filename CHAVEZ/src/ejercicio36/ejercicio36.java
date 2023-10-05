package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int ingreso = 8, ingreso_max = 0, ganancia_max = 0, ingreso_min = 100000;

		for (int i = 8; i <= 17; i++) {

			System.out.println("ganancia de esa hora: " + i);
			ingreso = entrada.nextInt();

			ganancia_max += ingreso;

			if (ingreso > ingreso_max) {

				ingreso_max = ingreso;

			}

			if (ingreso < ingreso_min) {

				ingreso_min = ingreso;

			}

		}
		System.out.println("ingreso maxima: " + ingreso_max);
		System.out.println("ingreso minima: " + ingreso_min);
        System.out.println("ingreso total es: " + ganancia_max);

	}
}
