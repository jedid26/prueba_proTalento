package clase_5;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear vectores
		
		//tipoDatos [] = new tipoDeDatos[]{valor1, valor2... valor n}
		//tipoDato [] nombre = new tipoDeDato[tamaño]
		
		String[] nombres = new String[] {"luz", "jose", "edwin", "jcarlos", "samir", "hernan","elsa" };
		String[] datos = new String[nombres.length];
		
		int size = nombres.length; //
		int j = 0;
		for (int i=0; i<size;i++) {
			if(nombres[i].startsWith("j")) {
				String nombre = nombres[i];
				datos[j] = nombre;
				
			}
		}
		
		
		System.out.println(Arrays.toString(datos));
	}

}
