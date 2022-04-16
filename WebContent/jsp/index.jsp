<%@page import="models.ImgCarrousel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Carrousel</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-8">			
				<div id="miCarrousel" class="carousel slide" data-bs-ride="carousel">
			  		<div class="carousel-inner">
			  				
			  			<%
			  				Object listObject = request.getAttribute("imagenes");
			  			
			  				List<ImgCarrousel> imagenes = (List<ImgCarrousel>)listObject;
			  				
			  				for(ImgCarrousel img: imagenes){
			  					 				
			  			%>			
			  				<div class="carousel-item active data-bs-interval="5000">
					     		<img src=<%=img.getImagenUrl()%> class="d-block w-100" alt="...">
					     		<div class="carousel-caption d-none d-md-block">
							        <p><%=img.getDescripcion() %></p>
							    </div>
					    	</div>
			  						
			  			<%
			  				}	
			  			%>
			  		</div>
				 	<button class="carousel-control-prev" type="button" data-bs-target="#miCarrousel" data-bs-slide="prev">
					    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
					    <span class="visually-hidden">Previous</span>
				  	</button>
				  	<button class="carousel-control-next" type="button" data-bs-target="#miCarrousel" data-bs-slide="next">
					    <span class="carousel-control-next-icon" aria-hidden="true"></span>
					    <span class="visually-hidden">Next</span>
				  	</button>
				</div>				
			</div>		
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
	</body>
</html>