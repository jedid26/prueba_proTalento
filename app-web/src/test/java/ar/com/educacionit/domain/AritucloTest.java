package ar.com.educacionit.domain;

import java.util.Date;

public class AritucloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articulos miArticulo = new Articulos("titulo1", new Date(), "0001", 2500d, 5, 1l, 1l);
		
		String titulo = miArticulo.getTitulo();
		
		boolean iguales = titulo.equals("TITULO1");
		
		if(iguales) {
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
	}

}
