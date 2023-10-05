package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[][] tabla = new int[2][2];
		int matriz_negativa = 0;

		tabla[0][0] = 1;
		tabla[0][1] = 2;
		tabla[1][0] = 5;
		tabla[1][1] = 7;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] <= 0) {
					matriz_negativa = tabla[i][j];
					continue;
				}

				else {
					System.out.print(tabla[i][j] + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\nel numero de la matriz negativa es: " +matriz_negativa);
		
	}
}