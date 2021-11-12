package clase_3;

import java.util.Scanner;

public class Condicional_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Ingrese un dato y si es > 18 imprimir "mayor de edad"
		//De lo contrario indicar "No Mayor de edad"
		System.out.println("Ingrese edad");
		
		int edad = teclado.nextInt();
		
		//boolean true
		if(edad>=18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("No Mayor de edad");
		}
		teclado.close();
	}
	
}
