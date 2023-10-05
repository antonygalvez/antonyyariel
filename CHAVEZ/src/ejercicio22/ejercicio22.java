package ejercicio22;

import java.util.Scanner;

public class ejercicio22 {
public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

String nomb;
int numero, intentos=1;

int numeroAleatorio = (int) (Math.random() * 10);

System.out.println("Eliga un numero entre el 0 y 10: ");
numero = entrada.nextInt();

        while (numero!=numeroAleatorio) {
        intentos++;
        System.out.println("No, la erraste");
        System.out.println("ingrese otro numero: ");
    numero = entrada.nextInt();
}

System.out.println("el numero aleatorio es: "+numeroAleatorio);
System.out.println("ganaste");
System.out.println("Numero de intentos: "+intentos);

}
}
