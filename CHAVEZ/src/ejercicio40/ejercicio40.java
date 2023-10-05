package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int numeros [] = new int [5];
        int temperaturas=0, promedio=0;
      
        
        System.out.println("ingrese las temperaturas");
       
        
        
        for(int i=0;i<5;i++){
            
            System.out.print((i+1)+". ingrese las temperaturas: "); 
              numeros[i] = datos.nextInt();
         
             temperaturas += numeros[i]; 
                  
             promedio = temperaturas / 5;
             
         }
        
        
       
      
         
       System.out.println("\nImprimir las temperaturas");
         for(int i:numeros) {
              System.out.println("Los numeros son: "+i);

	}
         System.out.println("\n el promedio de las temperaturas es:"+promedio);

	}
}
