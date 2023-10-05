package ejercico41;

import java.util.Scanner;

public class ejercico41 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		String[] nombres_ejemplo = { "Messi", "Maradona", "Aymar", "Gallardo", "Palermo",
                "Riquelme", "Vagoneta", "Eito", "Leybovich" , "Raffo" };
        

        
        for (String nombres_almacenados : nombres_ejemplo) {
            
            System.out.println(nombres_almacenados);
        }
	}

}
