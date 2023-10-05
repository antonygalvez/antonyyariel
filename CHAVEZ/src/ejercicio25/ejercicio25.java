package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

          int numero,contador = 0;
          
          boolean flag = false;
          int numeroAleatorio = (int) (Math.random() *99);
          
          do {
        	  contador++;
        	  System.out.println("adivana el numero");
        	  numero = entrada.nextInt();
        	  
        	  
        	 
        	  
        	  
        	  if (numero == numeroAleatorio ) { 
        		 
        		System.out.println("Ganaste el numero era:"+numeroAleatorio);
        		System.out.println("Los intentos fueron: "+contador);
        		  
        		  
        	  }
        	  
        	  else if (numero != numeroAleatorio && contador == 5 ) {
        		  
        		  System.out.println("Ha llegado al limite de : "+contador);
        		  flag = true;
        		  
        	  }
        	  
        	  
        	  
        	  
         } while (numero != numeroAleatorio && flag == false);
        	  
                  	  
        
        
	}
}