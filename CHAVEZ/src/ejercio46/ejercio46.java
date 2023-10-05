package ejercio46;

import java.util.Scanner;

public class ejercio46 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int[] numsocio = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		int busqueda;

		for (int i = 0; i < numsocio.length; i++) {

			if (numsocio[i] % 2 == 1) {
				System.out.println(" el numero de socio " + numsocio[i] + " es impar: ");
				continue;
			}

		}

	}

}
