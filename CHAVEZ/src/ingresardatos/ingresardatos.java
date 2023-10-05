package ingresardatos;

import java.util.Scanner;

public class ingresardatos {
	public static void main(String arg[]) {
		 
Scanner entrada = new Scanner (System.in);

	String nombre1; 

	String nombre2;
	
	int edad1;
	int edad2;
	
	
	
	System.out.println("\ningresar nombre 1:");
	nombre1 = entrada.next();
	System.out.println("\ningresar otro nombre 2: ");
	nombre2 = entrada.next();
	
	System.out.println("ingresar edad1: ");
	edad1 = entrada.nextInt();
	System.out.println("ingresar edad2: ");
	edad2 = entrada.nextInt();
	
	
	System.out.println("\ningresar nombre 1: " +nombre1);
	System.out.println("\ningresar edad 1: " +edad1);
	
	System.out.println("\ningresar nombre 2: " +nombre2);
	System.out.println("\ningresar edad 2: " +edad2);
	
	
	}
}