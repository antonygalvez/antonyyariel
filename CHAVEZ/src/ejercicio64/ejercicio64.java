package ejercicio64;

import java.util.Scanner;

public class ejercicio64 {

	static String nombre, nomMinuscula;
	static String apellido, apellidoMinuscula;
	static char nomcortada;
	static char apecortada;

	public static void nombres() {
		Scanner datos = new Scanner(System.in);
		System.out.println("ingrese su nombre");
		nombre = datos.next();

		System.out.println("ingrese su apellido");
		apellido = datos.next();

		String nomMinuscula = nombre.toLowerCase();
		String apellidoMinuscula = apellido.toLowerCase();
		nomMinuscula.toUpperCase().charAt(0);
		apellidoMinuscula.toUpperCase().charAt(0);
		
		nombre.charAt(0);
		apellido.charAt(0);
		System.out.println(nomMinuscula + nombre);
		System.out.println(apellido);
	}

	
}
