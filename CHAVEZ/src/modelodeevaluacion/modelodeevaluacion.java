package modelodeevaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class modelodeevaluacion {
	private static final String NULL = null;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] apellidos = { "galvez", "chavez", "carmen", "flores", "tarqui" };
	;
		System.out.println("Cantidad de DNI: ");
		int cantidad = entrada.nextInt();

		int[] DNI = new int[cantidad];

		for (int i = 0; i < DNI.length; i++) {
			System.out.println("Ingresar una lista de DNIs: ");
			DNI[i] = entrada.nextInt();

		}

		System.out.println("\nDNI ordenado ascendente");
		Arrays.sort(DNI);
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("DNI ASCENDENTE: " + DNI[i]);
		}
		System.out.println("ingrese apellido: ");
		apellidos[] = entrada.next();
		boolean encontrApellido = false;
	
		for (int j = 0; j < cantidad; j++) {
			
			System.out.println("el numero del dni es: " + DNI[j]);
			System.out.println("el apellido de la persona: " + apellidos[j]);
			encontrApellido = true;

			if (encontrApellido == false) {
				System.out.println("el dni no figura en el sistema");
				

			}

			
		}

	}
}
