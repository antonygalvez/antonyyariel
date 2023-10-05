package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		String[] nombre = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int[] numsocio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		int busqueda;

		System.out.println("“Para encontrar a un individuo, ingresar número de socio:");
		busqueda = datos.nextInt();

		for (int i = 0; i < numsocio.length; i++) {

			if (busqueda == numsocio[i]) {

				System.out.println("el numero ingresado pertenece al socio llamado : " + nombre[i]);
			
			}

		}
	}

}
