package clase_5;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantFilas = 2;
		int cantCols = 2;
		Integer[][] matriz = new Integer[cantFilas][cantCols];
		
		for(int fila = 0; fila < cantFilas; fila++) {
			for(int col=0; col<cantCols;col++) {
				matriz[fila][col] = (fila+col);
			}
		}
		for(int fila = 0; fila < cantFilas; fila++) {
			for(int col=0; col<cantCols;col++) {
				System.out.println(matriz[fila][col]);				
			}
		}
		
		

	}

}
