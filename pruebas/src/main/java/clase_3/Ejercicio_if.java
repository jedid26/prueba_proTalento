package clase_3;

public class Ejercicio_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c;
		
		a = 15;
		b = 20;
		c = 16;
		
		if (a > b && a >c) {
			System.out.println(a+" es el mayor");
		}if (b > a && b > c) {
			System.out.println(b+" es el mayor ");
		}if (c > a && c > b) {
			System.out.println(c+" es el mayor");
		} else {
			System.out.println("Son iguales");
		}
		
	}

}
