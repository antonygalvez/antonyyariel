package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("adivina el numero");
		numero = entrada.nextInt();

		
		
	int numeroAleatorio = (int) (Math.random() *10);
		
	
	if(numero==numeroAleatorio) {
		
		System.out.println("ganaste");
		}
	else  {
	
	System.out.println("perdiste");
	
	System.out.println("el numero era: "+ numeroAleatorio);
	}
	
	}
}
