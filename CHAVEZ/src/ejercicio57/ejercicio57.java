package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {

	static float n1, n1_int;

	public static void fraccion() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un primer numero con fraccion: ");
		n1 = entrada.nextFloat();
	}

	public static float fraccionaria(float a) {

		int n1_int = (int) a;
		float decimal = n1 - n1_int;
		return decimal;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		fraccion();
		fraccionaria(n1);
		System.out.println("el resultado de la fraccion es: " + fraccionaria(n1));

	}

}