package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float nota = 0, nota_max = 0, prom = 0, nota_min = 11;

		for (int i = 1; i <= 5; i++) {

			System.out.println("Coloque las notas de alumno: " + i);
			nota = entrada.nextInt();

			prom += nota;

			if (nota > nota_max) {

				
				nota_max = nota ;
		
			}

			 if (nota< nota_min) {

			 nota_min = nota;
				
			}

		}
		prom = prom / 5;
		System.out.println("nota maxima: "+nota_max);
		System.out.println("nota minima: "+nota_min);

		System.out.println("el promedio de la nota es: " + prom);
	}
}
