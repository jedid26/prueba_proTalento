package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	public static Connection obtenerConexion() {
		String url = "jdbc:mysql://127.0.0.1:3306/practica-adicional-seman-15?serverTimezone=UTC&userSSL=false";
		String user = "root";
		String password = "root";
		String diverName  = "com.mysql.cj.jdbc.Driver";
		
		try {
			
			Class.forName(diverName);
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception  e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public static void main(String[] args) {	
			try (Connection con = AdministradorDeConexiones.obtenerConexion();) {			
				System.out.println("Conexion obtenida");
			}catch (Exception e) {			
				e.printStackTrace();
			}
		}
}
