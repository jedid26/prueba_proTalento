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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
				
	}

	//DO POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		//Captura de datos enviados desde el formulario
		String nombrePersona = request.getParameter("nombre");
		String apellidoPersona = request.getParameter("apellido");
		String documentoPersonma = request.getParameter("documento");
		String ocupacionPersona = request.getParameter("ocupacion");
		Integer edadPersona = Integer.parseInt(request.getParameter("edad"));
		Date fechaNacimientoPersona = null;
		try {
			fechaNacimientoPersona = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("fechaNacimiento"));					
		} catch (ParseException e) {
			System.out.println("No se pudo parsear fecha de nacimiento "+e.getMessage());
		}
		
		Persona nuevaPersona = new Persona(nombrePersona, apellidoPersona, documentoPersonma, edadPersona, ocupacionPersona, fechaNacimientoPersona);
		
		if (data.registrarPersona(nuevaPersona)) {
			
		}
		
		
		
	}

}	
