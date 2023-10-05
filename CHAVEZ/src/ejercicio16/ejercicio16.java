package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int hora,min,seg;
		
		System.out.println("ingrese hora");
		hora = entrada.nextInt();
		
		System.out.println("ingrese minutos");
		min = entrada.nextInt();
		
		System.out.println("ingrese segundos");
		seg = entrada.nextInt();
		
		if (hora >0 && hora<24) {
			System.out.println("la hora es: "+hora);
		
		}
		else {
			System.out.println("la hora no es valida: ");
	    }
		if (min >0 && min<60) {
			System.out.println("los minutos son: "+min);
		}
		else {
			System.out.println("los minutos no son validos: ");
	    }
		
		 if (seg >0 && seg<60) {
			System.out.println("los segundos son: "+seg);
		
		}
		 else {
				System.out.println("los segundos no son validos: ");
		    }
		
	}
}