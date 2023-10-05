package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String[] nombre = new String[12]; 
        int [] edad = new int[12]; 
        
        
        
        for (int i = 0; i < 12; i++) {
                    
        System.out.println("Ingresa el nombre del jugador :");
        nombre[i] = datos.next();
    
        System.out.println("Ingresa la edad correspondiente: ");
        edad[i] = datos.nextInt();
        
        }

    System.out.println("\n ");

    for( int i = 0;i<12;i++)
    {

        System.out.println("Nombre en la posicion " + i + ": ");
        System.out.println(nombre[i]);

        System.out.println("Edad en la posicion " + i + ": ");
        System.out.println(edad[i]);

        System.out.println("\n ");

    }
		
		
		
		
	}
}
