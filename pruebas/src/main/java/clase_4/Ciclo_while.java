package clase_4;

public class Ciclo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[] edades = new short[] {10,5,25};
		
		//definir i por fuera
		int i = 0;
		
		while (i < edades.length) {
			System.out.println("pos: "+ i + ", val: "+edades[i]);
			i++;
		}
	}

}
