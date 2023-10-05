package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		int numero,resul;
		
		System.out.println("indica un numero de la tabla");
		numero = entrada.nextInt();
		
		for (int i = 1;i<= 20; i++ ) {
			resul=numero *i;
			System.out.println(numero+"*"+i+"="+ resul);
			
	 
			resul=numero *i;
			
		
		}
	}

}
