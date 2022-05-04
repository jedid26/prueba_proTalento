package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.ImgCarrouselDao;
import exceptions.DuplicatedException;
import jdbc.AdministradorDeConexiones;
import models.ImgCarrousel;
import service.ImgCarrouselService;
import service.impl.ImgCarrouselServiceImpl;

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

	@Override
	public void updateImgById(ImgCarrousel newImg){
		
		String sql = "UPDATE carrousel SET descripcion=?, imagen=?, activo=? WHERE id=?";	
		
		try(Connection con = AdministradorDeConexiones.obtenerConexion();) {
			
			try(PreparedStatement st = con.prepareStatement(sql);) {
				
				st.setString(1, newImg.getDescripcion());
				st.setString(2, newImg.getImagenUrl());
				st.setInt(3, newImg.getActivo());
				st.setInt(4, newImg.getId());
				
				st.execute();
			}		
		} catch (SQLException ex) {			
			System.out.println("No se pudo actualizar "+ ex.getMessage());
			ex.printStackTrace();
		}
	}	
}
