package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import domain.Categorias;
import domain.Marcas;
import services.CategoriaService;
import services.MarcasService;
import services.exceptions.ServiceException;
import services.impl.CategoriaServiceImpl;
import services.impl.MarcasServiceImpl;


@WebServlet("/controllers/ListadoServlet")
public class ListadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Llamado capa de servicio
		MarcasService marcaService = new MarcasServiceImpl();
		CategoriaService categoriaService = new CategoriaServiceImpl();
		
		//Clase object mapper de Jackson
		ObjectMapper om = new ObjectMapper();
				
		try {
			
			List<Marcas> listaMarcas = marcaService.findAll();
			List<Categorias> listaCategoria = categoriaService.findAll();
			
			Map<String, Object> jsonObject = new HashMap<String, Object>();
			jsonObject.put("categorias", listaCategoria);
			jsonObject.put("marcas", listaMarcas);
			
			String json = om.writeValueAsString(jsonObject);
			
			response.getWriter().print(json);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}		
	}
}
