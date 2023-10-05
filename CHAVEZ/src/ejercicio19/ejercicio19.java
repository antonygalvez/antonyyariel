package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		char cafe;

		System.out.println("ingrese que cafe quiere");
		cafe = entrada.next().charAt(0);
		
		switch (cafe) {
		case '1':System.out.println(" café elegido: cortado"); break;
		
		case '2' :System.out.println("café elegido: Latte"); break;
		
		case '3':System.out.println("cafe elegido: solo "); break;
		
		case '4':System.out.println("cafe elegido: lagrima"); break;
		
		case '5':System.out.println("gracia vuelva pronto"); break;
		
		default:System.out.println("numero equivocado");
		}
		
		
		
		
		
		
}
}