package clase_4;

import java.util.Scanner;

public class Ejercicio_ciclo_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantRegistros;
		int[] vector;
		int cantPares = 0, cantImpares = 0;
		int acumPares = 0, acumImpares = 0;
		double promedio;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de registros a procesar: ");
		
		do {
			cantRegistros = teclado.nextInt();
		} while(cantRegistros <= 0);
		
		vector = new int[cantRegistros];
		
		//carga de datos
		for ( int i =0; i<cantRegistros;i++) {
			System.out.println("Ingrese un dato: ");
			int dato = teclado.nextInt();
			vector[i] = dato;
		}
		
		for (int num:vector) {
			if (num % 2 == 0) {
				cantPares++;
				acumPares += num;
			} else {
				cantImpares++;
				acumImpares += num;
			}
		}		
		
		promedio = (double)(acumImpares + acumPares)/vector.length;
		System.out.println("Cantidad de números pares: "+cantPares);
		System.out.println("Suma de números pares: "+acumPares);
		System.out.println("Cantidad de números impares: "+cantImpares);
		System.out.println("Suma de números impares: "+acumImpares);
		System.out.println("Promedio de números ingresados: "+promedio);	
		teclado.close();
	}

}
