package que_hace_cada_cosa;

import java.util.Scanner;

public class que_hace_cada_cosa  {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {//muestra en panalla
			int opc;
			System.out.println("\tEste programa te permite resolver algunos problemas");// System.out.println() declarada
			System.out.println("\tElegí una opción: ");
			System.out.println("1. Calcular raiz cuadrada.");
			System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
			System.out.println("3. Jugar al bingo " );
		
			opc = entrada.next().charAt(0);//para ingresar una de las opciones
      
			switch (opc) {// switch condicion para igresar unas de la opciones 

			case '1': System.out.println("Ingresa un número para calcular su raiz cuadrada: ");

				int num_raiz;//int numeros enteros
				num_raiz = entrada.nextInt();

				if (num_raiz >= 0) {// if sirve para si cumple esto no hace lo otro
					int raiz_cuadrada = (int) Math.sqrt(num_raiz);// raiz cuadrada de un numero
					
					System.out.println("El resultado es: " + raiz_cuadrada);

					}

				 else {// else si no cumple la condicion if hace esto
					System.out.println("No se puede calcular la raiz de un negativo.");
				}

				break;
			case '2':
				System.out.println("Ingresa un numero: ");

				int num_signo; 
				num_signo = entrada.nextInt();

				if (num_signo == 0) { // num_signo es igual a 0
					System.out.println("El numero es cero");
				} else if (num_signo > 0) {// si no cumple con if le da otra opciones
					System.out.println("El numero es positivo");
				} else {
					System.out.println("El numero es negativo");
				}

				break; // para cerra el case

			case '3':// una de las opcion que muestra switch
				System.out.println("Ingresa un numero entre 0 y 9");

				int num_bingo;
				num_bingo = entrada.nextInt();

				int num_ganador = (int) (Math.random() * 9);// da un numero aleatorio
				int num_ganador2;

				if (num_bingo == num_ganador) {// si num_bingo es igual a num_ganador
					System.out.println("Ganaste!");
				} else {
					System.out.println("Perdiste :");
					System.out.println("El numero ganador es: " + num_ganador);
				}

				break;

			default:
				System.out.println("Opcion incorrecta.");
				break;

			}
		}
	}

}
