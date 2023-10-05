package ejercicio6;
import java.util.Scanner;
public class ejercicio6 {
 
	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);	
	double nota;
		
		 System.out.println("digite nota :");
			nota = entrada.nextFloat();
	
	double numRedondeado = (float) Math.round(nota);
	
	System.out.println("la nota es "+numRedondeado);
	}
}