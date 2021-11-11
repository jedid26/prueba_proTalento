package pruebas;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + d = eliminar una linea
		
		//Operadores
		
		//matemáticos
		// + - * /
		
		int edad1 = 10;
		int edad2 = 20;
		int res = edad1 + edad2;
		System.out.println("edad 1 + edad 2 = " + res);
		
		// aplicado a tipos String, los concatena
		String nombre = "Carlos";
		String apellido = "Lopez";
		String completo = nombre + " " + apellido;
		System.out.println("Nombre completo = " + completo );
		
		double alto = 175.5;
		
		float ancho = 205.7f;
		
		double resDiv = alto/ancho;
		System.out.println(resDiv);
		
		boolean resAltoAncho = alto != ancho;
		System.out.println(alto + "!=" + ancho + "=" + resAltoAncho);
		
		
	}

}
