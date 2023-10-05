package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float numero;

		System.out.println("digite un numero");
		numero = entrada.nextFloat();

		if (numero > 0) {

			System.out.println("se puede divivir");

		} else if (numero < 0) {

			System.out.println("no se puede divivir");
		} else {

			System.out.println("no se puede divivir");
		}

	}
}
