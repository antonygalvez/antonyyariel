package matrices_por_programa;

import java.util.Scanner;

public class matrices_por_programa {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int nFilas, nColumnas;

		System.out.println("Determina el numero de filas: ");
		nFilas = entrada.nextInt();

		System.out.println("Determina el numero de columnas: ");
		nColumnas = entrada.nextInt();

		// Declaro la matriz LUEGO de tener definidas filas y columnas
		int[][] matriz = new int[nFilas][nColumnas];

		// Ingreso valores en cada posicion de la matriz
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {

				System.out.print("Agrega un dato en la posicion: " + i + " " + j + "\n");
				matriz[i][j] = entrada.nextInt();
			}
			System.out.println();
		}

		// Mostramos en pantalla los datos ingresados
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			// Pongo un syso vacio para que haga un salto de linea al terminar una fila
			System.out.println();
		}

	}

	int nFilas, nColumnas;

	System.out.println("Determina el numero de filas: ");nFilas=entrada.nextInt();

	System.out.println("Determina el numero de columnas: ");nColumnas=entrada.nextInt();

	// Declaro la matriz LUEGO de tener definidas filas y columnas
	int[][] matriz = new int[nFilas][nColumnas];

	// Ingreso valores en cada posicion de la matriz
	for(
	int i = 0;i<nFilas;i++)
	{
		for (int j = 0; j < nColumnas; j++) {

			System.out.print("Agrega un dato en la posicion: " + i + " " + j + "\n");
			matriz[i][j] = entrada.nextInt();
		}
		System.out.println();
	}

	// Mostramos en pantalla los datos ingresados
	for(
	int i = 0;i<nFilas;i++)
	{
		for (int j = 0; j < nColumnas; j++) {

			System.out.print(matriz[i][j] + " ");

		}
		// Pongo un syso vacio para que haga un salto de linea al terminar una fila
		System.out.println();
	}

}}
