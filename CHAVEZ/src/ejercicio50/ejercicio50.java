package ejercicio50;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio50 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int dinero = 0, dineroPlus = 0, dineroMax = -10, dineroMin = 10000000;

		//Cantidad de personas que apostaran
		System.out.println("Cantidad de personas que van a apostar: ");
		int personas = datos.nextInt();

		int [] apuestas = new int[personas];
		int num = 0;

		for (int i = 0; i < apuestas.length; i++) {
		System.out.println("inserte apuesta: ");
		apuestas[i] = datos.nextInt();

		dinero = dinero + apuestas[i];
		if (apuestas[i] > dineroMax) {
		dineroMax = apuestas[i];
		}
		if (apuestas[i] < dineroMin) {
		dineroMin = apuestas[i];
		}
		}
		System.out.println("");
		for (int j = 0; j < apuestas.length; j++) {
		num++;
		if (apuestas[j] <= 500) {
		continue;
		}
		System.out.println("La persona "+num +" aposto:" +apuestas[j]);
		}
		System.out.println("\nDinero Maximo apostado: "+ dineroMax);
		System.out.println("Dinero Minimo apostado: "+ dineroMin);
		
	}

	}

