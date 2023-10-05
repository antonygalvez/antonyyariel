package funcionesArrays;

import java.util.Arrays;
import java.util.Scanner;

public class funcionesArrays {
// Declaro la variable global que indica los elementos del array.
	static int cantidadNumeros;

// Declaro el array global, pero NO lo creo (no coloco new Int[]). Solo lo declaro.
// No lo creo al array, porque todavia no se cuantos elementos hay.
	static int[] numerosPares;

// Función que devuelve un array de los primeros 'n' números pares
	public static int[] obtenerNumerosPares(int n) {
		numerosPares = new int[n];
		for (int i = 0; i < n; i++) {
			numerosPares[i] = 2 * (i + 1); // Calculamos el número par correspondiente
		}
		return numerosPares; // se devuelve el array sin colocar "[]"
	}
// Fin de la funcion obtenerNumerosPares
	
// Comienzo de la funcion elementosArray
	
	public static void elementosArray() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantos numeros pares queres ver?");
		cantidadNumeros = entrada.nextInt(); // Cantidad de numeros pares a obtener
	}
// Fin de la funcion elementosArray
	
	
// Comienzo de la función principal
	public static void main(String[] args) {
		
		elementosArray();
		
		int arrayNumeros[] = obtenerNumerosPares(cantidadNumeros);

		// Mostramos el contenido del array en la consola
		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.println("Los primeros " + cantidadNumeros + " números pares son: "
					+ arrayNumeros[i]);
		}
	}
// Fin de la función principal

}
