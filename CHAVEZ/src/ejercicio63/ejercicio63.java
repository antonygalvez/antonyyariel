package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {

	static String correo, contraseņa;
	static boolean bandera = false;

	public static void Correo() {
		Scanner datos = new Scanner(System.in);
		System.out.println("Ingresar su correo electronico: ");
		correo = datos.next();
		while (bandera != true) {
			if (correo.indexOf("@") > correo.indexOf(".") || correo.indexOf("@") == -1 || correo.indexOf(".") == -1) {
				System.out.println("El correo es incorrecto, vuelva a intentarlo");
				correo = datos.next();
			} else {
				bandera = true;
			}
		}
	}

	public static void contraseņa() {
		bandera = false;
		Scanner datos = new Scanner(System.in);
		System.out.println("Ingrese su contraseņa: ");
		contraseņa = datos.next();
		while (bandera != true) {
			if (contraseņa.length() < 6 || contraseņa.length() > 12) {
				System.out.println("Vuelva a ingresar la contraseņa");
				contraseņa = datos.next();
			} else {
				bandera = true;
			}
		}
	}

	public static void resultado() {
		System.out.println("el correo es " + correo);
		System.out.println("la contraseņa es " + contraseņa);
	}

	public static void main(String[] ars) {
		Correo();
		contraseņa();
		resultado();
	}
}
