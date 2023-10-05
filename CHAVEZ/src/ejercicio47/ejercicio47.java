package ejercicio47;

import java.util.Scanner;

public class ejercicio47 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String[] apellido = new String[1];
		int[] notas = new int[5];

		for (int i = 0; i < apellido.length; i++) {
			System.out.println("Ingresar el Apellido: ");
			apellido[i] = datos.next();
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("ingrese nota del alumno: ");
			notas[i] = datos.nextInt();
		}
		for (int num : notas) {
			System.out.print(num + " ");
		}

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < (notas.length - i - 1); j++) {
				if (notas[j] > notas[j + 1]) {
					int pepe = notas[j];
					notas[j] = notas[j + 1];
					notas[j + 1] = pepe;
				}
			}

		}
		for (int i = 0; i < apellido.length; i++) {
			System.out.println("\nApellido del alumno: " + apellido[i]);
		}
		System.out.println("Notas ordenadas:");
		for (int num : notas) {
			System.out.println("Notas del alumno: " + num);
		}
	}
}
