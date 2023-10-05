package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {

	static int n1;
	boolean negativo = false;

	public static void numero() {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		n1 = entrada.nextInt();

	}

	public static boolean resultados(int a) {
  boolean positivo = false;
		
  if ( a< 0 ) {
			System.out.println("el numero es negativo");

		} else if (a >= 0 ) {
			System.out.println("el numero es positivo");
     positivo = true;
		}

		return positivo;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		numero();
		resultados(n1);
		System.out.println("el resultado es: " + resultados(n1));

	}

}