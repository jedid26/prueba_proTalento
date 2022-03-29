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
	
		<form action="<%=request.getContextPath()%>/FormularioServlet" method="post">
	
		<label>Nombre</label>
		<br>
		<input type="text" name="nombre">
		<br>
		<br>
		<label>Apellido</label>
		<br>
		<input type="text" name="apellido">
		<br>
		<br>
		<label>Documento</label>
		<br>
		<input type="text" name="documento">
		<br>
		<br>
		<label>Ocupación</label>
		<br>
		<select name="ocupacion">
			<%
				Datos.cargarOcupaciones();
				Iterator<String> iterador = Datos.ocupaciones.iterator();
				while(iterador.hasNext()){ 
					String valor = iterador.next();
			%>
				<option value=<%=valor%>><%=valor%></option>
			<%
				}
			%>
		</select>
		<br>
		<br>
		<label>Edad</label>
		<br>
		<input type="number" name="edad">
		<br>
		<br>
		<label>Fecha de nacimiento</label>
		<br>
		<input type="date" name="fechaNacimiento">
		<br>
		<br>
		<input type="submit" value="Registrar">
		
	</form>
	
	</div>

</body>
</html>