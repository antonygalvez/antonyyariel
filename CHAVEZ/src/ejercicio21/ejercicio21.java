package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String args[]) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		int temperatura = 35;

		while (temperatura <= 100) {
			System.out.println(" n°_temperatura: " + temperatura);
			Thread.sleep(20);

			temperatura=temperatura+2;
		
            
			
		if (temperatura == 85) {
			Thread.sleep(1000);
			System.out.println("cuidado temperatura 85 peligrosa");
				
				
			}
		
		}

		System.out.println("valor extremo.apagando PC");

	}

}
