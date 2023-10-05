package ejercicio60;

import java.util.Scanner;

public class ejercicio60 {

	static String[] apellido = new String[5];
	static int[] notas = new int[5];

	public static void IngDeDatos() {
		Scanner datos = new Scanner(System.in);
		for (int i = 0; i < apellido.length; i++) {
			System.out.println("Ingresar el Apellido: ");
			apellido[i] = datos.next();
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("ingrese nota del alumno: ");
			notas[i] = datos.nextInt();
		}

		System.out.println("");
	}

	public static void OrdenadoYDesordenado() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < (notas.length - i - 1); j++) {
				if (notas[j] > notas[j + 1]) {
					int nashe = notas[j];
					notas[j] = notas[j + 1];
					notas[j + 1] = nashe;
				}
			}

		}
	}

	public static void resultado() {
		for (int i = 0; i < apellido.length; i++) {
			System.out.println("\nApellido del alumno: " + apellido[i]);

		}
		System.out.println("Notas ordenadas:");
		for (int num : notas) {
			System.out.println("Notas del alumno: " + num);
		}
	}

	public static void main(String[] args) {
		IngDeDatos();
		OrdenadoYDesordenado();
		resultado();
	}
}
