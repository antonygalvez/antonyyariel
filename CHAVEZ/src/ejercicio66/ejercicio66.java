package ejercicio66;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio66 {

	static int numero = -1;
	static boolean sinConflictos = true;

	public static void numeros1() {
		Scanner datos = new Scanner(System.in);

		do {
			try {

				System.out.println("ingrese un numero entero: ");
				numero = datos.nextInt();
				sinConflictos = false;

			} catch (InputMismatchException e) {
				System.out.println("Error: Debes ingresar un dato valido.");
				datos.nextLine();
/*
* La función datos.nextLine() es un método de la clase Scanner en Java que se
* utiliza para leer y descartar la línea actual (o el resto de la línea actual)
* después de que se haya producido una entrada incorrecta o no válida.
* En el contexto de tu código, se utiliza después de capturar una excepción
* InputMismatchException para descartar la entrada incorrecta y avanzar al
* siguiente intento de entrada. Esto es importante porque después de que se
* produce una excepción, el valor no válido todavía está en el búfer del
* scanner, y si no lo descartas, el programa continuará leyendo la entrada
* incorrecta en un bucle infinito.
*/
}
	} while (sinConflictos);
		
	}

	public static void main(String[] args) {

		numeros1();

	}
}
