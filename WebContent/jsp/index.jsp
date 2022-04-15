<%@page import="models.ImgCarrousel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>


	<div class="container">
		<div class="row justify-content-center">
			<div class="col-8">			
				<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
			  		<div class="carousel-inner">
			  				
			  			<%
			  				Object listObject = request.getAttribute("imagenes");
			  			
			  				List<ImgCarrousel> imagenes = (List<ImgCarrousel>)listObject;
			  				
			  				for(ImgCarrousel img: imagenes){
			  					 				
			  			%>			
			  				<div class="carousel-item active">
					     		<img src=<%=img.getImagenUrl()%> class="d-block w-100" alt="...">
					     		<div class="carousel-caption d-none d-md-block">
							        <p><%=img.getDescripcion() %></p>
							    </div>
					    	</div>
			  						
			  			<%
			  				}	
			  			%>
			  		</div>
					<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
					  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
					  <span class="visually-hidden">Previous</span>
					</button>
					<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
					  <span class="carousel-control-next-icon" aria-hidden="true"></span>
					  <span class="visually-hidden">Next</span>
					</button>
				</div>				
			</div>		
		</div>
	</div>	
</body>
</html>