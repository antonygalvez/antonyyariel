package ejercicio28;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio28 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		int bateria = 100;

		while (bateria > 0 && bateria <= 100) {
			System.out.println(" puedes seguir usando: " + bateria);
			Thread.sleep(1000);

			bateria--;

			if (bateria == 20) {
				Thread.sleep(1000);
				System.out.println("cuidado bateria baja: "+ bateria);
				bateria--;
			}

		}
		System.out.println("apagando...");
		

	}
}
