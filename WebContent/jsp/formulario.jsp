<%@page import="java.util.Iterator"%>
<%@page import="models.Datos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de datos</title>
</head>
<body>	

	<header>
		<h1>Formulario de registro</h1>
	</header>

	<div>
	
		<form action="/FormularioServlet" method="post">
	
		<label>Nombre</label>
		<br>
		<input type="text" name="nombre">
		<br>
		<label>Apellido</label>
		<br>
		<input type="text" name="apellido">
		<br>
		<label>Documento</label>
		<br>
		<input type="text" name="documento">
		<br>
		<label>Ocupación</label>
		<br>
		<select name="ocupacion">
			<%
				Datos.cargarOcupaciones();
				Iterator<String> iterador = Datos.ocupaciones.iterator();
				while(iterador.hasNext()){ 
			%>
				<option value=<%= iterador.toString()%>><%= iterador.toString()%></option>
			<%
				}
			%>
		</select>
		<label>Edad</label>
		<br>
		<input type="number" name="edad">
		<br>
		<label>Fecha de nacimiento</label>
		<br>
		<input type="date" name="fechaNacimiento">
		<br>
		<input type="submit" value="Enviar">
		
	</form>
	
	</div>

</body>
</html>