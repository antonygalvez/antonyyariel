package matrices_por_usuario;

public class matrices_por_usuario {
	public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        // Matriz de 2 filas x 3 columnas

        // Asignar valores a los elementos de la matriz
        
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
       
        
        /* OTRA MANERA DE ASIGNAR ELEMENTOS A UNA MATRIZ:
         * matriz[][] = { {1, 2, 3}, {4, 5, 6} }
         * La cantidad de filas,es la cantidad de llaves internas.
         * La cantidad de columnas, es la cantidad de elementos dentro
         * de cada llave. 
         */

        // Imprimir la matriz
        
        for (int i = 0; i < matriz.length; i++) {
        	// completo filas
            for (int j = 0; j < matriz[i].length; j++) {
            	
                System.out.print(matriz[i][j] + " ");
                // completo columnas
            }
            System.out.println();
        }
    }
}
