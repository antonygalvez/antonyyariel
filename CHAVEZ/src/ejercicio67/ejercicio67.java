package ejercicio67;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio67 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	
			try {
				System.out.println("Ingrese un numero para calcular su raiz cuadrada ");
				int numero = entrada.nextInt();
				float raiz_cuadrada = (float) Math.sqrt(numero);

				if (numero < 0) {
				
					throw new ArithmeticException();
				}else {
					System.out.println("el resultado es: " + raiz_cuadrada);
				}
				

			} catch (ArithmeticException e) {
				System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo: ");
				entrada.nextLine();
				} catch (InputMismatchException e) {
				System.out.println("Error: Debes ingresar un dato valido.");
			} 

	

	}
}
