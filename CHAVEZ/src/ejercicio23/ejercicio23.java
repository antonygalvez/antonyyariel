package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String args[]) throws InterruptedException {

		Scanner entrada = new Scanner(System.in);

		int num1, num2, resultado;

		
		System.out.println("ingrese un numero");
		num1 = entrada.nextInt();
		System.out.println("ingrese otro numero");
		num2 = entrada.nextInt();

		while (num1 != 0) {

			resultado = num1 + num2;
			
			System.out.println(" el resultado es: " + resultado);
			
		   System.out.println("Ingrese un numero para otra suma: " );
			System.out.println("o ingrese 0 para cerrar el programa: " );
			num1= entrada.nextInt();
			
			if (num1 == 0) {
				System.out.println("chauu");
				num1 = entrada.nextInt();
			}
			
			else if (  num1 > 0) {
				System.out.println(" ingresar el siguiente  numero");
				num2 = entrada.nextInt();
				
			}
			
		}

	}
}
