package ordenamiento_burbuja2;

public class ordenamiento_burbuja {
	public static void main(String[] args) {
		int[] arreglo = { 5, 2, 8, 3, 1 };

		// Mostrar el arreglo desordenado
		System.out.println("Arreglo desordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}

		// Aplicar el algoritmo de ordenamiento burbuja
		
		for (int i = 0; i < (arreglo.length - 1) ; i++) {
			 
			for (int j = 0; j < (arreglo.length - i - 1) ; j++) {
		
				
				if (arreglo[j] > arreglo[j + 1]) {
					
					int temporal = arreglo[j];
					
					arreglo[j] = arreglo[j + 1];
					
					arreglo[j + 1] = temporal;
					
				}
			}
		}

		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo ordenado:");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
	}
}