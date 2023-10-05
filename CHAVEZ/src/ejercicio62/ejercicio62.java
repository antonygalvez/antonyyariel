package ejercicio62;

import java.util.Scanner;

public class ejercicio62 {
	static String[] apellido = new String[5];
	static String apellidoMax = "";
	static String apellidoMin = "{";

	public static void apellidos() {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			System.out.println("Ingresar el Apellido: ");
			apellido[i] = entrada.next();

		}
	}

	public static void ordenamiento() {

		for (int i = 0; i < apellido.length; i++) {
			if (apellido[i].compareTo(apellidoMax) > 0) {
				apellidoMax = apellido[i];
			}
			if (apellido[i].compareTo(apellidoMin) < 0) {
				apellidoMin = apellido[i];
			}
		}

	}

	public static void main(String[] args) {

		apellidos();
		ordenamiento();
		System.out.println("el apellido mas cercano a la letra A es: " + apellidoMin);
		System.out.println("el apellido mas lejano a la letra Z es: " + apellidoMax);
	}

}