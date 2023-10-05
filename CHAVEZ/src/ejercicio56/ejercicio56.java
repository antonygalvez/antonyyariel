package ejercicio56;
/*Vas a hacer un programa ordenado, con funciones, para calcular el
porcentaje de asistencias de un estudiante. Primero que nada, solicitá el
nombre y apellido del alumno.
Luego, los pasos que te voy a indicar, hacelos dentro de una función
porcentajeAsistencias ():

• Pedir la cantidad de asistencias del alumno.
• También solicitar la cantidad de clases totales.
• Dividir la cantidad de asistencias sobre las clases totales.
• Retornar en la función porcentajeAsistencias () el porcentaje de
asistencias.
• Ahora, mostrá en pantalla el porcentaje de asistencias.*/

import java.util.Scanner;

public class ejercicio56 {
	
	static String nombre,apellido;
	static int n1,n2,n3;
	
	public static void ingresarnombre_apellido() {
		 
		    Scanner entrada = new Scanner(System.in);
		    System.out.println("Ingresa el nombre del estudiante : ");
		    nombre = entrada.next();
		    System.out.println("Ingresa el apellido del estudiante : ");
		    apellido = entrada.next();
		   
		}
	
	public static void asistencias() {
		 
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa la cantidad de asistencias del estudiante : ");
	    n1 = entrada.nextInt();
	    System.out.println("Ingresa la cantidad de clases : ");
	    n2 = entrada.nextInt();
	}
	
	public static float porcentajeAsistencias(float a, float b) { 
	   
		float porcentajeAsistencias = (a / b )*100;
		return porcentajeAsistencias;
	}
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		ingresarnombre_apellido();
		asistencias();
		porcentajeAsistencias(n1,n2);
	    System.out.println("el porcentaje de la asistencias es: " + porcentajeAsistencias(n1,n2));
	    
	}
}

