package EVALUACION;

import java.util.Arrays;
import java.util.Scanner;

/*Examen individual.
EXAMEN PR�CTICO: 60% de la evaluaci�n.

Consigna:
Indicale a un empleador de un local, que indique cu�ntos sanguches de milanesa se producen cada 2hs.
 El local abre a las 8hs, y cierra a las 14hs.
Luego, realiz� lo siguiente: 
Determin� la cantidad m�xima y la cantidad m�nima. Mostralas en pantalla.
Orden� num�ricamente de manera ascendente las cantidades.
Luego, mostr� el array ordenado en pantalla.
Descartar todas las cantidades mayores a 20, y mostrar en pantalla �nicamente las cantidades menores O iguales 20.
Al final del programa, indicar el promedio de cantidades en el d�a.
Luego de terminar el algoritmo, entregar por classroom como "Apellido.zip", en en cual se debe incluir el paquete (package) y la clase (class).
Se considerar� para la evaluaci�n:
Que el algoritmo cumpla con los puntos anteriormente mencionados.
Cada frase mostrada en pantalla, debe estar expresada de manera prolija. 
La correcta indentaci�n del c�digo (o sea, que el c�digo est� ordenado).
No es necesario comentar la sintaxis del programa.
*/
public class EVALUACION {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cantidadmax = -10000, cantidadmin = 10000, promedio, prom = 0;

		int sanguches[] = new int[33];

		for (int hora = 8; hora < 14; hora += 2) {
			System.out.println("ingrese la cantidad " + hora + "hs ");
			sanguches[hora] = datos.nextInt();

			if (sanguches[hora] > cantidadmax) {
				cantidadmax = sanguches[hora];
			}

			System.out.println(" ");

			if (sanguches[hora] < cantidadmin) {

				cantidadmin = sanguches[hora];

			}

		}
		System.out.println("cantidad maxima de sangunches " + cantidadmax);
		System.out.println("cantidad minima de sanguches " + cantidadmin);

		System.out.println(" ARREGLO DESORDENADO");
		for (int num : sanguches) {
			if (num > 0 && num >= 20)
				System.out.println("num " + " ");
			continue;
		}
		/* Orden� num�ricamente de manera ascendente las cantidades. */

		for (int j = 0; j < sanguches.length - 1; j++) {

			System.out.println("\ncantidad ordenado ascendente ");
			Arrays.sort(sanguches);
			for (int i1 = 0; i1 < sanguches.length - 1; ++i1) {
				if (sanguches[i1] > 0) {
					System.out.println("cantidad ascendente: " + sanguches[i1]);
				}
			}
			System.out.println("/nArreglo ordenado ");
			for (int num2 : sanguches) {
				if (num2 > 0 && num2 >= 20)
					System.out.println("num2 " + sanguches);
				System.out.println("/nArreglo ordenado ");
				for(int num2: sanguches) {
					if (num2 > 0 && num2 >=20)
						System.out.println("num2 "+ sanguches);
				continue;
				}
			}
			for (int i = 0; i < sanguches.length - 1; i++) {
				if (sanguches[i] > sanguches[i + 1]) {

					int temporal = sanguches[i];

					sanguches[i] = sanguches[i + 1];

					sanguches[i + 1] = temporal;
				}

			}
			for (int r = 8; r < 14; r += 2)
				promedio = prom / 4;
			System.out.println(" ");

		}

	}
}
