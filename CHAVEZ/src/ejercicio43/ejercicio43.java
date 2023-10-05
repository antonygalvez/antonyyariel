package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

for (int i = 1; i <= 10; i++ ){
	
	if (i < 0) {
	continue;
	}
	System.out.println("el valor i es igual a: " +i);
}
System.out.println("fin del programa cuando termina el continue");
	}
}