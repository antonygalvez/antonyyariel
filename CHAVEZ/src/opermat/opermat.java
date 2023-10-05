package opermat;

import java.util.Scanner;

public class opermat {
		public static void main(String arg[]) {
			
	Scanner entrada = new Scanner (System.in);
	
	float num1, num2, num3, num4, suma, resta, multip, div, resto;
	
	System.out.println("\tOperaciones matematicas");
	
	System.out.println("Escriba­ el numero1: ");
	num1 = entrada.nextFloat();
	
	System.out.println("Escriba­ el numero2: ");
	num2 = entrada.nextFloat();
	
	System.out.println("Escriba­ el numero3: ");
	num3 = entrada.nextFloat();
	
	System.out.println("Escriba­ el numero4: ");
	num4 = entrada.nextFloat();
	
	System.out.println("Los resultados, son: ");
	
	suma = num1+ num2; 
	resta = num3-num4; 
	multip = num1*num2; 
	div = num3/num4; 
	resto = num1%num2; 
	
	System.out.println("Resultado de la suma:"+suma);
	
	System.out.println("Resultado de la resta:"+resta);
	
	System.out.println("Resultado de la multiplicacion:"+multip);
	
	System.out.println("Resultado de la division:"+div);
	
	System.out.println("El resto de la division es: "+resto);
	
	
	
	
	
}
}
