package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float costoTotal, gastoInicial;

		System.out.println("\ningrese un monto: ");
		gastoInicial = entrada.nextFloat();
		
	
		if (gastoInicial > 15000) {
			costoTotal = gastoInicial*0.90f;
			System.out.println("\nSupera los 15000: " + costoTotal);
			
		} else {
			System.out.println("\nNo supero los 15000: " + gastoInicial);
		}

	}
}
