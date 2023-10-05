package ejercicio5;
import java.util.Scanner;
public class clasemath {

	public static void main(String[] args) {
		  
    Scanner entrada = new Scanner (System.in);	
    
    float numero;
    int numero1;
    
    System.out.println("digite un numero:");
	numero=entrada.nextFloat();
	
	System.out.println("digite otro numero:");
	numero1=entrada.nextInt();
		
	float raiz_cuadrada = (float) Math.sqrt(numero);
	int raiz_cuadrada1 = (int) Math.sqrt(numero1);
	
	System.out.println("El valor de la raiz es: "+raiz_cuadrada);
	System.out.println("El valor de la raiz es: "+raiz_cuadrada1);
		  
	  }
} 