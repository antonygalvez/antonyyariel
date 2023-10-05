package ejercicio30;

import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args) throws InterruptedException {
		
		try (Scanner datos = new Scanner(System.in)) {
		}
	

		for (int i = 1;i<= 100; i++ ) {
			System.out.println(" n°_viewers: " + i);
			Thread.sleep(20);

	

		}

		System.out.println("has llegado a los 100 viewers");
		
		
	}

}
