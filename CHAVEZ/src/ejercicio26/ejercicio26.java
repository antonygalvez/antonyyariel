package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contra = 140906, contador = 0;
		int ingresar_contra;

		do {
			contador++;

			System.out.println("Ingresa la contraseña: ");
			ingresar_contra = entrada.nextInt();

			
			if (ingresar_contra == contra) {

				System.out.println("Ingresando...");

			}

			else if (ingresar_contra != contra && contador == 3) {

				System.out.println("Bloqueando... ");

			}

		} while (ingresar_contra != contra && contador < 3);
	

	}

}
