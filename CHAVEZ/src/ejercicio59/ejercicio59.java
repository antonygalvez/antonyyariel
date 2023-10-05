package ejercicio59;

import java.util.Scanner;

public class ejercicio59 {

	static int n1,n2, numMax = -100, numMin = 100;

	public static int total(int a) {

		for (int i = 0; i < 3; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese un numero: ");
			n1 = entrada.nextInt();
			
				if (n1 > numMax) {
					numMax = n1;
					}
				if (n1 < numMin) {
					numMin = n1;
					}	
		}
		return a;

		}
	

	public static void main(String[] args) {
		total(n1);
		System.out.println("el numero maximo es: " + numMax);
		System.out.println("el numero minimo es: " + numMin);

	}
}
