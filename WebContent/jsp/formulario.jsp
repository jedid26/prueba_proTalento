
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
	
		<form action="/FormularioServlet" method="get">
	
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
				<option value="estudiante">Estudiante</option>
				<option value="Trabaja">Estudiante</option>
		</select>
		<label>Edad</label>
		<br>
		<input type="number" name="edad">
		<br>
		<label>Fecha de nacimientoZ</label>
		<br>
		<input type="date" name="fechaNacimiento">
		<button>Enviar</button>
		
	</form>
	
	</div>

</body>
</html>