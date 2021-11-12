package clase_3;

public class Ejercicio_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		
		n1 = 22;
		n2 = 29;
		n3 = 29;
		
		int mayor= n1;

		
		if (mayor <= n2) {
			mayor = n2;
			if (mayor <= n3) {
				mayor = n3;
			}
		}
		
		System.out.println(mayor + " es el mayor");
		
		
		
		
		/*
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el mayor");
		} if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " es el mayor");
		} if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " es el mayor");
		} 
		// igualdad de dos números
		if (n1 == n2 && n1 > n3) {
			System.out.println(n3 +" es el mayor" );
		} if (n1 == n3 && n2 > n3) {
			System.out.println(n2+ " es el mayor");
		} else {
			System.out.println(n2 + " es el mayor");
		} if ( n3 == n1 && n2 > n1) {
			System.out.println(n1+ " es el mayor");
		} if (n1 == n2 && n2 == n3) {
			System.out.println("son iguales");
		}
		*/		
	}

}
