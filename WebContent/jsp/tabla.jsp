<%@page import="models.ImgCarrousel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--CSS-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Tabla Carrousel</title>
</head>
<body>
	
	<div class="container">
		<%		
			Object listObject = request.getAttribute("imagenes");
		
			List<ImgCarrousel> imagenes = (List<ImgCarrousel>)listObject;
			
			for(ImgCarrousel img: imagenes){
		%>
		<div class="row m-5">
			<div class="col-4">
				<span class="border border-3">
					<img src=<%= img.getImagenUrl() %> class="img-fluid" alt="..." height="400" width="400">		
				</span>	
			</div>
			<div class="col-8">
				<form action=<%=request.getContextPath()+"/ListadoImagenesServlet"%> method="POST">
					<span class="border border-end-0 border-2 ">
						<label class="form-label pd-2">ID</label>
						<br>
						<input type="text" name="id" value=<%= String.valueOf(img.getId()) %> readonly="readonly">
						<br>
						<label class="form-label pt-2">Descripcion</label>
						<br>
						<input type="text" name="descripcion" value=<%= img.getDescripcion() %> size="50" maxlength="280">
						<br>
						<label class="form-label pt-2">URL</label>
						<br>
						<input type="text" name="url" value=<%= img.getImagenUrl() %> size="50">
						<br>
						<button type="submit" class="btn btn-primary mt-2">Actualizar</button>
					</span>	
				</form>			
			</div>	
		</div>
		<%
			}	
		%>
	</div>
	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>