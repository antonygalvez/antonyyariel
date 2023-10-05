package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("ingrese un numero: ");
		num1 = entrada.nextInt();

		System.out.println("ingrese un numero: ");
		num2 = entrada.nextInt();

		System.out.println("ingrese un numero: ");
		num3 = entrada.nextInt();

		if (num1 > num2 && num3 < num2) {
			System.out.println("el mayor: " + num1);
			System.out.println("el segundo mayor: " + num2);
			System.out.println("el menor: " + num3);
		}

		if (num1 > num2 && num2 < num3) {

			System.out.println("\nel mayor: " + num1);
			System.out.println("el segundo mayor: " + num3);
			System.out.println("el menor: " + num2);
		}

		if (num2 > num3 && num3 < num1) {
			System.out.println("\nel mayor: " + num2);
			System.out.println("el segundo mayor: " + num1);
			System.out.println("el menor: " + num3);
		} 
		
		if (num2 > num1 && num1 < num3) {
			System.out.println("el mayor: " + num2);
			System.out.println("el segundo mayor: " + num3);
			System.out.println("el menor: " + num1);
		}

		if (num3 > num1 && num1 < num2) {

			System.out.println("\nel mayor: " + num3);
			System.out.println("el segundo mayor: " + num2);
			System.out.println("el menor: " + num1);
	
		} 
		if (num3 > num2 && num2 < num1) {
			System.out.println("\nel mayor: " + num3);
			System.out.println("el segundo mayor: " + num1);
			System.out.println("el menor: " + num2);

		}

	}
}