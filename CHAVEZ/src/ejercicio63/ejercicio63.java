package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {

	static String correo, contrase�a;
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

	public static void contrase�a() {
		bandera = false;
		Scanner datos = new Scanner(System.in);
		System.out.println("Ingrese su contrase�a: ");
		contrase�a = datos.next();
		while (bandera != true) {
			if (contrase�a.length() < 6 || contrase�a.length() > 12) {
				System.out.println("Vuelva a ingresar la contrase�a");
				contrase�a = datos.next();
			} else {
				bandera = true;
			}
		}
	}

	public static void resultado() {
		System.out.println("el correo es " + correo);
		System.out.println("la contrase�a es " + contrase�a);
	}

	public static void main(String[] ars) {
		Correo();
		contrase�a();
		resultado();
	}
}
