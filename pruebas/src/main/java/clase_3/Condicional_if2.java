package clase_3;

import java.util.Scanner;

public class Condicional_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		teclado.close();
		//Ingrese una contraseña y usuario
		// si contraseña = "1234" y usuario = "admin" => "ok"
		// de lo contrario "fail"
		
		String usuario;
		String password;
		
		usuario = "jose";
		password = "12345";
				
		//boolean true
		if(usuario == "admin" && password == "1234") {
			System.out.println("ok");
		} else {
			System.out.println("fail");
		}
		
		if(usuario == "admin") {
			if (password == "1234") {
				System.out.println("ok");
			} else {
				System.out.println("fail");
			}
		}else {
			System.out.println("fail");
		}
	}
	
}
