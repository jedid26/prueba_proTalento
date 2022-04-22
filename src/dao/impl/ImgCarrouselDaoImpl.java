package dao.impl;

import java.io.CharArrayReader;
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
	public void updateImgById(ImgCarrousel newImg) throws DuplicatedException{
		
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
			if(ex instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido actualizar " + sql, ex.getCause());
			}
		}
		
	}
	
	public static void main(String[] args) throws DuplicatedException {
		ImgCarrouselService carrouselService = new ImgCarrouselServiceImpl();
		
		ImgCarrousel img1 = new ImgCarrousel(1, "Bosque con aurora en el cielo", "https://picsum.photos/id/724/700/500", 1);
		
		carrouselService.updateImgById(img1);
	}
}
