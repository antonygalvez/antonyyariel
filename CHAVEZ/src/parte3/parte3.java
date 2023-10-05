package parte3;
import java.util.Scanner;
public class parte3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		char letra;

		System.out.println(" INGRESE SU TALLE");
		System.out.println(" talle s ");
		System.out.println(" talle m ");
		System.out.println(" talle l ");
		letra = entrada.next().charAt(0);
		
		
		switch (letra) {
		
		case 's':System.out.println(" cuantas remeras deseas comprar"); 
		
		float remeras,descuento,numero,remerastotal,totalApagar=0;
		
		numero = entrada.nextFloat();
		
		
		if (numero > 30) {
			
			System.out.println("no hay stock");
			
		}
		else if ( numero > 14 && numero < 30) {
			
		remeras= 5000f;
		
	  remerastotal = (numero*remeras);
	   descuento = remerastotal * 0.15f;
	   totalApagar = remerastotal - descuento;
	   
	   System.out.println("cantidad de remeras que compro: "+ numero);
	   System.out.println("total a pagar" + totalApagar);
	   System.out.println("valor de cada remera" + remeras);
		}	
		else {
			remeras = 5000f; 
			remerastotal = (numero*remeras);
			  System.out.println("cantidad de remeras que compro: "+ numero);
			   System.out.println("total a pagar" + remerastotal);
		
		}
		break;
		
		case 'm': System.out.println("cuantas remeras desea comprar: ");
		
	   
		float remeras2,descuento2,numero2,remerastotal2,totalApagar2=0;
	
		numero2 =  entrada.nextFloat();
		
		
		if (numero2 > 40 ) {
		System.out.println(" no hay stock");	
		}
		else if (numero2 > 21 && numero2 <40) {
		
			remeras2= 5500f;
			
			remerastotal2 = (numero2*remeras2);
		    descuento2 = remerastotal2 * 0.15f;
			totalApagar2 = remerastotal2 - descuento2;
			
			System.out.println("cantidad de remeras que compro: "+ numero2);
			   System.out.println("total a pagar" + totalApagar2);
			   System.out.println("valor de cada remera" + remeras2);
			
		} 
		
		else {
			remeras2 = 5500f; 
			remerastotal2 = (numero2*remeras2);
			  System.out.println("cantidad de remeras que compro: "+ numero2);
			   System.out.println("total a pagar" + remerastotal2);
		
		}
		break;
		
		case 'l': System.out.println("cuantas remeras deseas comprar");
	
		float remeras3,descuento3,numero3,remerastotal3,totalApagar3=0;
		
		numero3 =  entrada.nextFloat();
		
		
		
		if(numero3 > 50) {
			
		System.out.println(" no hay stock");	
		}
		else if(numero3 > 34 && numero3 <50 ) {
		
           remeras3= 5500f;
			
			remerastotal3 = (numero3*remeras3);
		    descuento3 = remerastotal3 * 0.15f;
			totalApagar3 = remerastotal3 - descuento3;
			
			System.out.println("cantidad de remeras que compro: "+ numero3);
			   System.out.println("total a pagar" + totalApagar3);
			   System.out.println("valor de cada remera" + remeras3);
		}
		else {
			remeras3 = 5500f; 
			remerastotal3 = (numero3*remeras3);
			  System.out.println("cantidad de remeras que compro: "+ numero3);
			   System.out.println("total a pagar" + remerastotal3);
		}break;
		default:
			System.out.println("Opcion incorrecta.");
			break;
}	
	}	
	
}	
	
	


