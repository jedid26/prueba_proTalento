<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<!-- http://localhost:8080/ejercicio-web/Main.jsp -->
<head>
<meta charset="UTF-8">
<title>Menu Principal</title>
<!-- CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<button onclick="obtenerListado()" >Abrir Modal</button>
			</div>
		</div>
	</div>
	
	<!-- Modal Tablas -->
	<div class="modal fade" id="tablasModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="tablasModalLabel">Tablas</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
	      	<h4>Articulos</h4>
	      	<div class="table-responsive">
	      		<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">ID</th>
			      <th scope="col">Titulo</th>
			      <th scope="col">Codigo</th>
			      <th scope="col">Fecha creacion</th>
			      <th scope="col">Precio</th>
			      <th scope="col">Stock</th>
			      <th scope="col">Marca</th>
			      <th scope="col">Categoria</th>
			    </tr>
			  </thead>
			  <tbody id="tablaArtBody">
			  	
			  </tbody>
			</table>
	      	</div>      	
			<br>
			<h4>Categorias</h4>
			<div class="table-responsive">
				<table class="table">
				  <thead>
				    <tr>
				    
				      <th scope="col">ID</th>
				      <th scope="col">Descripcion</th>
				      <th scope="col">Codigo</th>
				      <th scope="col">Habilitada</th>
				    </tr>
				  </thead>
				  <tbody id="tablaCatgBody">

				  </tbody>
				</table>
			</div>	 
	      </div>
	    </div>
	  </div>
	</div>
	<!-- Modal Formulario -->
	<div class="modal fade" id="formularioModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="formularioModalLabel"></h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <div class="modal-body">
      		<form>
				<div class="mb-3" id="divTitulo" hidden="">
					<label for="tituloInput" class="form-label">Titulo</label>
				   	<input type="text" class="form-control" id="tituloInput">
			  	</div>
			  	<div class="mb-3" id="divCodigo" hidden="">
				  <label for="codigoInput" class="form-label">Codigo</label>
				  <input type="text" class="form-control" id="codigoInput">
			  	</div>
			  	<div class="mb-3" id="divPrecio" hidden="">
				  <label for="precioInput" class="form-label">Precio</label>
				  <input type="text" class="form-control" id="precioInput">
			  	</div>
			  	<div class="mb-3" id="divStock" hidden="">
				  <label for="stockInput" class="form-label">Stock</label>
				  <input type="text" class="form-control" id="stockInput">
			  	</div>
			  	<div class="mb-3" id="divCodigo" hidden="">
				  <label for="codigoInput" class="form-label">Codigo</label>
				  <input type="text" class="form-control" id="codigoInput">
			  	</div>
			  	
			  <button type="submit" class="btn btn-primary">Guardar</button>
			</form>
	      </div>
	    </div>
	  </div>
	</div>
<!-- AXIOS  -->
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<!-- Bootstrap JS  -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<!-- JS Propio -->
<script src="./js/modals.js" type="text/javascript"></script>
</body>
</html>