package ejercicio24;

import java.util.Scanner;

public class ejercicio24 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean decision = false;

		char pregunta = 'N';

		do {
			decision = false;

			System.out.println("¿puedo salir?");
			pregunta = entrada.next().charAt(0);

			if (pregunta == 'S') {
				decision = true;
				System.out.println("VOLVE EN MEDIA HORA ROMPE HUEVO");

			}

		

		} while (pregunta == 'N');

		
	}

}
