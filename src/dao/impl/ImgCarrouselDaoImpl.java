package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.ImgCarrouselDao;
import jdbc.AdministradorDeConexiones;
import models.ImgCarrousel;

public class ImgCarrouselDaoImpl implements ImgCarrouselDao {


	@Override
	public List<ImgCarrousel> findAll() {
		
		String sql = "SELECT * FROM carrousel";
		
		List<ImgCarrousel> listaImagenes = new ArrayList<ImgCarrousel>();
		
		//Pedir conexion
		try(Connection con = AdministradorDeConexiones.obtenerConexion();) {
			
			//Crearcion objeto statement
			try(Statement st = con.createStatement();) {
				
				//Recorrer tabla virtual con info de DDBB
				try(ResultSet rs = st.executeQuery(sql);) {
					while (rs.next()) {
						String idImagen 	= rs.getString("id");
						String descrImagen 	= rs.getString("descripcion");
						String urlImagen 	= rs.getString("imagen");
						String activoImagen = rs.getString("activo");
						
						System.out.println(rs.getString("descripcion"));
						
						ImgCarrousel imagen = new ImgCarrousel(Integer.valueOf(idImagen),descrImagen, urlImagen, Integer.valueOf(activoImagen) );
						listaImagenes.add(imagen);
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error al consultar base de datos "+ e.getMessage());
			e.printStackTrace();
		}
			
		return listaImagenes;
	}
}
