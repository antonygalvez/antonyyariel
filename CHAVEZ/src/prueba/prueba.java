/*
Se le solicita que ingrese el n�mero de legajo de cada estudiante, que es un n�mero de cinco cifras (ejemplo: 45876).*/
/*Ordenar de manera ascendente los n�meros de legajo.*/

/*Luego, debe ingresar 5 apellidos de estudiantes que ingresan a la universidad.*/

/*Tambi�n debe ingresar la calificaci�n con la cual aprob� cada uno su examen de ingreso (de 6 a 10).*/

/*Determinar la nota m�xima y la nota m�nima.*/

/*En el algoritmo, se debe calcular el promedio de los ex�menes de los 5 estudiantes.*/

/*Mostrar en pantalla el apellido de cada estudiante, su n�mero de legajo, y su calificaci�n del examen de ingreso.*/

/*Mostrar tambi�n en pantalla la calificaci�n m�xima, la m�nima, y a qui�n pertenece cada una.*/

/*Mostrar en pantalla finalmente el promedio de los ex�menes. */

package prueba;

import java.util.Arrays;
import java.util.Scanner;

public class prueba {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] legajo = new int[5];

		String[] apellido = new String[5];

		int[] nota = new int[5];

		int notamax = 0, notamin = 10;
		float promedio = 0;
		for (int i = 0; i < legajo.length; i++) {
			
					
			System.out.println("Ingrese el numero de legajo: ");
			legajo[i] = datos.nextInt();

			System.out.println("Ingrese apellido: ");
			apellido[i] = datos.next();

			System.out.println("Ingrese su nota: ");
			nota[i] = datos.nextInt();

		}
		System.out.println("\nLegajo ordenado ascendente");
		Arrays.sort(legajo);
		for (int i = 0; i < legajo.length; i++) {
			System.out.println("Legajo ASCENDENTE: " + legajo[i]);
		}
		String apellidosmax = "q", apellidosmin = "a";

		for (int i = 0; i < 5; i++) {
			if (nota[i] > notamax) {
				notamax = nota[i];
				apellidosmax = apellido[i];
			}

		}
		for (int j = 0; j < 5; j++) {
			if (nota[j] < notamin) {
				notamin = nota[j];
				apellidosmin = apellido[j];
			}

		}

		for (int i = 0; i < apellido.length; i++) {
			System.out.println("El apellido del estudiante es: " + apellido[i] + "\nSu numero de legajo es: "
					+ legajo[i] + "\ny su nota es: " + nota[i]);
		}
		System.out.println("La nota maxima es: " + notamax + " La nota es de: " + apellidosmax);
		System.out.println("La nota minima es: " + notamin + " La nota es de: " + apellidosmin);
		for (int i = 0; i < 5; i++) {
			promedio += nota[i];

		}
		promedio = promedio / 5;

		System.out.println("El promedio de las notas es: " + promedio);
	}
}
