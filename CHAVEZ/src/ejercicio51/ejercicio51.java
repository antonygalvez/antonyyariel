package ejercicio51;

import java.util.Scanner;

public class ejercicio51 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		float[][] matriz = new float[2][3];
	    
		matriz[0][0] = 1.3425f;
	    matriz[0][1] = 2.6547f;
	    matriz[0][2] = 3.5645f;
	    
		for (int i = 0; i < matriz.length; i++) {
			 
			
			for (int j = 0; j < matriz[i].length; j++) {
	            	
	                System.out.print(matriz[i][j] + " ");
	             
	            }
			 break; 
		}
	     System.out.println();

	}

}
