package ejercicio55;

/*Escriba una función llamada alCuadrado() que calcule el cuadrado
del valor que se le transmite y despliegue el resultado. La función deberá
ser capaz de elevar al cuadrado números flotantes.*/
import java.util.Scanner;

public class ejercicio55 {

	static float n1;

	public static void ingresarNumeros() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un primer numero: ");
		n1 = entrada.nextFloat();
	}
	public static float alCuadrado (float a ) {
		
		float mulitiplicar = a * a ;
	    return mulitiplicar ;
		
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    alCuadrado(n1); 
	    System.out.println("el resultado al cuadrado es: " + alCuadrado(n1));
	    
	}
}
