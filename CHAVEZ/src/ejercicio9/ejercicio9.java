package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		String apellido;
		
		System.out.println("digite su nombre y apellido");
		nombre = entrada.next();

		int numeroAleatorio = (int) (Math.random() * 99);
		System.out.println("el numero es: " + numeroAleatorio);

	}
}
