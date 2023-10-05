package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String args[]) throws InterruptedException {

		Scanner datos = new Scanner(System.in);
		int viewers= 1;

		while (viewers <= 100) {
			System.out.println(" n°_viewers: " + viewers);
			Thread.sleep(20);

			viewers++;

		}

		System.out.println("has llegado a los 100 viewers");

	}
}
