package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.ImgCarrousel;
import service.ImgCarrouselService;
import service.impl.ImgCarrouselServiceImpl;

/**
 * Servlet implementation class ListadoImagenesServlet
 */
@WebServlet("/ListadoImagenesServlet")
public class ListadoImagenesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoImagenesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ImgCarrouselService carrouselService = new ImgCarrouselServiceImpl();
		
		List<ImgCarrousel> listaImagenes = carrouselService.findAll();
		
		if (listaImagenes == null || listaImagenes.isEmpty()) {
			System.out.println("lista vacia");
		}
		
		request.setAttribute("imagenes", listaImagenes);
		
		getServletContext().getRequestDispatcher("/jsp/tabla.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String desc = request.getParameter("descripcion");
		String url = request.getParameter("url");
		
		ImgCarrousel imgUpdate = new ImgCarrousel(id, desc, url, 1);
		
		ImgCarrouselService carrouselService = new ImgCarrouselServiceImpl();
		
		carrouselService.updateImgById(imgUpdate);
		
		getServletContext().getRequestDispatcher("/jsp/tabla.jsp").forward(request, response);
			
	}
}	
