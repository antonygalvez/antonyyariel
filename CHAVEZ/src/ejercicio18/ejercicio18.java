package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		char letra;

		System.out.println("ingrese su talle S , M , L");
		letra = entrada.next().charAt(0);
		
		switch (letra) {
		case 'S':System.out.println(" quedan 5 remeras."); break;
		
		case 'M' :System.out.println("quedan 2 remeras"); break;
		
		case 'L':System.out.println("no quedan ninguna"); break;
		
		default:System.out.println("letra equivocada");
		}
		
		
		
		
}
}