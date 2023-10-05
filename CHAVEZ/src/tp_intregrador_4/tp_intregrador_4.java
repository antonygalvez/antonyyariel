package tp_intregrador_4;

import java.util.Scanner;

public class tp_intregrador_4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroSecreto = (int) (Math.random() * 100);
		int intentos = 0;

		while (intentos < 10) {
			try {
				System.out.print("Ingresa un número entre 1 y 10: ");
				int numeroIngresado = entrada.nextInt();

				if (numeroIngresado < 1 && numeroIngresado > 100) {
					throw new IllegalArgumentException("El número debe estar entre 1 y 100.");
				}

				intentos++;

				if (numeroIngresado < numeroSecreto) {
					System.out.println("El número que ingresaste es mas bajo que el numero correcto.");
				} else if (numeroIngresado > numeroSecreto) {
					System.out.println("El número que ingresaste es mas alto que el numero correcto.");
				} else {
					System.out.println("Ganaste El número secreto era " + numeroSecreto + ".");
					System.out.println("Cantidad de intentos: " + intentos);
					break;
				}

				if (intentos == 10) {
					System.out.println("Agotaste tus 10 intentos El número secreto era " + numeroSecreto);
				}
			} catch (NumberFormatException e) {
				System.out.println("Por favor, ingresa un número válido.");
			} catch (IllegalArgumentException e) {
				System.out.println("el numero se a pasado o en menor");
			}
		}

	}
}
