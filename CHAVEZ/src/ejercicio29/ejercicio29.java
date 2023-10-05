package ejercicio29;

import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		int bateria = 100;
		
	
	for(int i=1; bateria > 0 && bateria<= 100; i--) {
		
		System.out.println(" bateria: " + bateria);
		Thread.sleep(200);
		bateria--;
		
		if ( bateria == 20){
			System.out.println("bateria baja");
			bateria--;
			
			Thread.sleep(1000);
			
			
		}
		}
	
	   System.out.println("apaganndo celular....");
	
	}

}
