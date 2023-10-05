package tp_1er_bi;

import java.util.Scanner;

public class tp_1er_bi {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int opc;//faltaba declarar opc
			System.out.println("\tEste programa te permite resolver algunos problemas");
			System.out.println("\tElegí una opción: ");
			System.out.println("1. Calcular raiz cuadrada.");// faltaba el punto y coma
			System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
			System.out.println("3. Jugar al bingo " );
		
			opc = entrada.next().charAt(0);//estaba mal hecho el codigo
      
			switch (opc) {

			case '1': System.out.println("Ingresa un número para calcular su raiz cuadrada: ");//faltaba los apostrofes y el break

				int num_raiz;
				num_raiz = entrada.nextInt();//aca tiene que estar entrada

				if (num_raiz >= 0) {// faltaba el "_"
					int raiz_cuadrada = (int) Math.sqrt(num_raiz);//faltaba poner (num_raiz)
					
					System.out.println("El resultado es: " + raiz_cuadrada);

					}

				 else {
					System.out.println("No se puede calcular la raiz de un negativo.");
				}

				break;
			case '2':
				System.out.println("Ingresa un numero: ");

				int num_signo; //faltaba poner el "_"
				num_signo = entrada.nextInt();//tendria que estar entrada en vez de datos

				if (num_signo == 0) {
					System.out.println("El numero es cero");
				} else if (num_signo > 0) {
					System.out.println("El numero es positivo");
				} else {//no lleva condicion
					System.out.println("El numero es negativo");
				}

				break;

			case '3':
				System.out.println("Ingresa un numero entre 0 y 9");

				int num_bingo;//faltaba el "_"
				num_bingo = entrada.nextInt();//entrada en vez datos

				int num_ganador = (int) (Math.random() * 9);//tiene que ir int y no double
				int num_ganador2;// no tiene que estar el igual "=" y no tiene que aver dos declaraciones iguales

				if (num_bingo == num_ganador) {
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
