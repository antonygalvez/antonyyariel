package ejercicio48;

public class ejercicio48 {
	public static void main(String[] args) {

		String [] apellidos = {"Chavez","Galvez","Flores","Rojas"};
		String apellidoMax = "";
		String apellidoMin = "{";
		 
		for(int i = 0; i < apellidos.length; i++) {
			
			if (apellidos[i].compareTo(apellidoMax)>0) {
				apellidoMax = apellidos[i];
			}
			 if (apellidos[i].compareTo(apellidoMin)<0) {
				apellidoMin = apellidos[i];
			}
		}
		System.out.println("ultimo apellido " + apellidoMax);
		System.out.println("primer apellido " + apellidoMin);
		
	}
}
