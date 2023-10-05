package ejercicio53;

import java.util.Scanner;

public class ejercicio53 {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

String apellido;

boolean flag = false;

String[][] matriz = new String[2][2];

for (int i = 0; i < matriz.length; i++) {

for (int j = 0; j < matriz[i].length; j++) {

System.out.println(" ingrese el apellido de la fila: " + i + " y la columna: " + j);
matriz[i][j] = entrada.next();

}

}
System.out.println(" ingrese el apellido que quiera encontrar: ");
apellido = entrada.next();

for (int i = 0; i < matriz.length; i++) {

for (int j = 0; j < matriz[i].length; j++) {

if (matriz[i][j].equalsIgnoreCase(apellido)) {

flag = true;
break;
}

}

}
if (flag == true) {

System.out.println("se encontro");
}

else  {
System.out.println("no se encontro") ;

}
}
}