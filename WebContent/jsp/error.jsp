<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
</head>
<body>
	<h1>Se han detectado errores al completar el formulario</h1>
	<br>
	<br>
	<a href="<%=request.getContextPath()%>/jsp/formulario.jsp">Volver al formulario</a>
	<br>
	<a href="<%=request.getContextPath()%>/jsp/listado.jspt">Listado de personas registradas</a>
</body>
</html>