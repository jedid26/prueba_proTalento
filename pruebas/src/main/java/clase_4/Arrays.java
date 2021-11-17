package clase_4;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] edades = new int[2]; // un vector de 2 posiciones
		
		// [0, 0]
		
		//carga
		edades [1] = 10;
	
		//atributo lenght
		
		int tama = edades.length;
		
		// acceder al último elemento
		edades[tama-1] = 5;
		
		// acceder al último elemento manual
		int edad = edades[1];
		System.out.println(edad);
		
		
		
		
	}

}
