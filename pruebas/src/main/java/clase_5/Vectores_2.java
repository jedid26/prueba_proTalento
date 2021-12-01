package clase_5;

import java.util.Arrays;

public class Vectores_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[] {"luz", "jose", "edwin", "jcarlos", "samir", "hernan","elsa" };
		
		int cantidad = 0;
		for(String nombre : nombres) {
			if(nombre.startsWith("j")){
				 cantidad++;
			}			
		}
		String [] datos = new String[cantidad];
		
		cantidad = 0;
		
		for (String nombre:nombres) {
			if(nombre.startsWith("j")) {
				datos[cantidad] = nombre;
				cantidad++;
			}
		}
		
		System.out.println(Arrays.toString(datos));
	}
	
}
