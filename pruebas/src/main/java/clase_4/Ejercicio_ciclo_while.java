package clase_4;

import java.util.Scanner;

public class Ejercicio_ciclo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer un vlaor
		// > 0 && <= 10
		// acumular la suma de dichos valores
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		int suma = 0;
		
		do {
			System.out.println("Ingrese valor: ");
			valor = teclado.nextInt();
			
			//lógica
			suma += valor;
		}while(valor > 0 && valor <= 10);
		teclado.close();
		System.out.println("La suma total es: "+suma);
		
		
	}

}
