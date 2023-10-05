package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		System.out.println("digite la calificacion");
		numero = entrada.nextInt();

		if (numero == 10) {

			System.out.println("sobresaliente");
		} 
		else if (numero <9 && numero>8) {
			System.out.println("notable");
		} 
		else if (numero <=7 && numero>=6) {
			System.out.println("suficiente");
		} 
		else if (numero < 6 && numero>3) {
			System.out.println("no_logrado");
		} 
		else if (numero <= 3 && numero>=1 ) {
			System.out.println("insuficiente");
		}
	}
}
