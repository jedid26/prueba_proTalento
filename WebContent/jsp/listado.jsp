<%@page import="models.Persona"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado personas registradas</title>
</head>
<body>

	<%
	
		Object listaObject = request.getAttribute("listado");
		Map<String, Persona> mapaListado = (Map<String, Persona>)listaObject;
		
		for (Map.Entry<String, Persona> entry : mapaListado.entrySet()) {
			Persona per = entry.getValue();
	%>
		<div style="">
			<h4>Clave (Documento) = <%=entry.getKey()%></h4>
			<h4>Valor</h4>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;Nombre: <%=per.getNombre()%></p>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;Apellido: <%=per.getApellido()%></p>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;Ocupacion: <%=per.getOcupacion()%></p>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;Edad: <%=per.getEdad()%></p>
			<p>&nbsp;&nbsp;&nbsp;&nbsp;Fecha Nacimiento: <%=per.darFormatoFecha(per.getFechaNacimiento())%></p>	
		</div>
			
	<%
		}
	%>

</body>
</html>