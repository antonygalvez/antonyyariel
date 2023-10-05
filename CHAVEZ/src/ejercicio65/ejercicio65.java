package ejercicio65;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio65 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
	
		  try {
	        	System.out.println("Ingresa su edad ");
	    	  int edad = entrada.nextInt();
	    		
	    		if (edad < 0) {
	                throw new ArithmeticException();
	            
	            }
		  } catch (ArithmeticException e) { 
	            System.out.println("Error: edad ingresada invalida ");
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Debes ingresar un dato valido.");
	        } finally { // Finally actua SIEMPRE. No es obligatorio.
	        	System.out.println("Programa finalizado.");
	        }
	
		  
	
	
	

	
	
	
	
	
	}	
}
