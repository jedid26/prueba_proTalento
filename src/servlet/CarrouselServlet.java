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
 * Servlet implementation class CarrouselServlet
 */
@WebServlet("/CarrouselServlet")
public class CarrouselServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarrouselServlet() {
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
		
		request.setAttribute("IMAGENES", listaImagenes);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
