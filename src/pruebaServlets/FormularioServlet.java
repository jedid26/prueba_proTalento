package pruebaServlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Datos;
import models.Persona;

@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Datos data = new Datos();

    public FormularioServlet() {
        super();
    }

    //DO GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
	}

	//DO POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Captura de datos enviados desde el formulario
		String nombrePersona = request.getParameter("nombre");
		String apellidoPersona = request.getParameter("apellido");
		String documentoPersonma = request.getParameter("documento");
		String ocupacionPersona = request.getParameter("ocupacion");
		Integer edadPersona = Integer.parseInt(request.getParameter("edad"));
		String fechaInput = request.getParameter("fechaNacimiento");
		
		SimpleDateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd");
		
		Date fechaNacimientoPersona = null;
		try {
			fechaNacimientoPersona = fechaFormateada.parse(fechaInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Persona nuevaPersona = new Persona(nombrePersona, apellidoPersona, documentoPersonma, edadPersona, ocupacionPersona, fechaNacimientoPersona);
		
		if (data.registrarPersona(nuevaPersona)) {
			System.out.println(nuevaPersona.toString()); 
		}
		
		response.sendRedirect(request.getContextPath()+"/jsp/formulario.jsp");
	}

}	
