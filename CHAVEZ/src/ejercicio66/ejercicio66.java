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
* La funci�n datos.nextLine() es un m�todo de la clase Scanner en Java que se
* utiliza para leer y descartar la l�nea actual (o el resto de la l�nea actual)
* despu�s de que se haya producido una entrada incorrecta o no v�lida.
* En el contexto de tu c�digo, se utiliza despu�s de capturar una excepci�n
* InputMismatchException para descartar la entrada incorrecta y avanzar al
* siguiente intento de entrada. Esto es importante porque despu�s de que se
* produce una excepci�n, el valor no v�lido todav�a est� en el b�fer del
* scanner, y si no lo descartas, el programa continuar� leyendo la entrada
* incorrecta en un bucle infinito.
*/
}
	} while (sinConflictos);
		
	}

	public static void main(String[] args) {

		numeros1();

	}
}
