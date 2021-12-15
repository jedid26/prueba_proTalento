package clase_5;

public class VectorObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//la base de todos los tipos de datos en java
		
		Object edad = 10;
		Object nombres = "carlos";
		Object flag = true;
		Object letra = 'a';
		
		Object [] datos = new Object[] {edad, nombres, flag,letra};
		
		//determinar que datos son de tipo boolean
		
		for( Object dato : datos ) {
			if(dato instanceof Boolean) {
				System.out.println(dato + " es tipo booleano");
			}
		}
		
		
	}

}
