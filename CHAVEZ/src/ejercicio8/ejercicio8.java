package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double numero, suma, multiplicar;

		System.out.println("digite un numero con decimal");
		numero = entrada.nextDouble();

		int base = (int) numero, exponente = 2;
		int potencia = (int) Math.pow(base, exponente);

		float numeroAleatorio1 = (float) (Math.random() * 1);

		suma = potencia + numeroAleatorio1;

		multiplicar = suma * 7;

		double raiz_cuadrada = Math.sqrt(multiplicar);

		System.out.println("el resultado es: " + raiz_cuadrada);
	}
}
