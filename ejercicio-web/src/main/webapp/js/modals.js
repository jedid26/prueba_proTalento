function obtenerListado() {
	
	//ASYNC
	//let response = await axios.get('http://localhost:8080/ejercicio-web/controllers/ListadoServlet');
	
	//console.log(response.data);
	
	const data = {
		"articulos": [
			{
				"id": 1,
				"titulo": "teclado",
				"codigo": "art000",
				"fecha_creacion": new Date().toLocaleDateString('en-GB'),
				"precio": 1500,
				"stock": 4,
				"marcas_id": 1,
				"categorias_id": 2
			},
			{
				"id": 2,
				"titulo": "mouse",
				"codigo": "art003",
				"fecha_creacion": new Date().toLocaleDateString('en-GB'),
				"precio": 800,
				"stock": 5,
				"marcas_id": 4,
				"categorias_id": 2
			}			
		],
		"categorias": [
			{
				"id": 1,
				"descripcion":"categoria1",
				"codigo": "cat000",
				"habilitada": 1
			},			
			{
				"id": 2,
				"descripcion":"categoria2",
				"codigo": "cat001",
				"habilitada": 1
			}
		]
	};
	
	//Manejo modal
	const tablasModal = new bootstrap.Modal(document.getElementById('tablasModal'))
	tablasModal.show();
	
	let tablaArt = document.getElementById('tablaArtBody');
	
	tablaArt.innerHTML = "";
	
	for (let art of data.articulos){
		
		tablaArt.innerHTML = tablaArt.innerHTML + 
		`
			<tr>
		      <th scope="row">${art.id}</th>
		      <td>${art.titulo}</td>
		      <td>${art.codigo}</td>
		      <td>${art.fecha_creacion}</td>
		      <td>${art.precio}</td>
		      <td>${art.stock}</td>
		      <td>${art.marcas_id}</td>
		      <td>${art.categorias_id}</td>
		      <td>
			  	<button type="button" class="btn btn-info" onclick="abrirFormArt(${art.id})" >Abrir modal</button>
			  </td>	
		    </tr>
		`
	};
	
	let tablaCatg = document.getElementById('tablaCatgBody');
	
	tablaCatg.innerHTML = "";
	
	for (let catg of data.categorias){
		tablaCatg.innerHTML = tablaCatg.innerHTML +
		`
			<tr>
		      <th scope="row">${catg.id}</th>
		      <td>${catg.descripcion}</td>
		      <td>${catg.codigo}</td>
		      <td>${catg.habilitada}</td>
		      <td>
			  	<button type="button" class="btn btn-info" onclick="abrirFormCatg(${catg.id})" >Abrir modal</button>
			  </td>
		    </tr>
		`
	}
};

function abrirFormArt(id){
	
	const data = {
		"articulos": [
			{
				"id": 1,
				"titulo": "teclado",
				"codigo": "art000",
				"fecha_creacion": new Date().toLocaleDateString('en-GB'),
				"precio": 1500,
				"stock": 4,
				"marcas_id": 1,
				"categorias_id": 2
			},
			{
				"id": 2,
				"titulo": "mouse",
				"codigo": "art003",
				"fecha_creacion": new Date().toLocaleDateString('en-GB'),
				"precio": 800,
				"stock": 5,
				"marcas_id": 4,
				"categorias_id": 2
			}			
		]
	};
	
	let art;
	
	for (let categoria of data.articulos){
		if(categoria.id === id){
			art = categoria;
		}
	};
		
	let articuloModalBody = document.getElementById('artModalBody');
	
	articuloModalBody.innerHTML = 
	`
		<form>
			<div class="mb-3" id="divId" >
				<label class="form-label">ID</label>	 
				<span>${art.id}</span>				
		  	</div>
			<div class="mb-3" id="divTitulo" >
				<label for="tituloInput" class="form-label">Titulo</label>
			   	<input type="text" class="form-control" id="tituloInput" value="${art.titulo}">
		  	</div>
		  	<div class="mb-3" id="divCodigo" >
			  <label for="codigoInput" class="form-label">Codigo</label>
			  <input type="text" class="form-control" id="codigoInput" value="${art.codigo}">
		  	</div>
		  	<div class="mb-3" id="divPrecio" >
			  <label for="precioInput" class="form-label">Precio</label>
			  <input type="text" class="form-control" id="precioInput" value="${art.precio}">
		  	</div>
		  	<div class="mb-3" id="divStock" >
			  <label for="stockInput" class="form-label">Stock</label>
			  <input type="text" class="form-control" id="stockInput" value="${art.stock}">
		  	</div>
		  	<div class="mb-3" id="divMarcaId" >
			  <label for="marcaIdInput" class="form-label">ID Marca</label>
			  <input type="text" class="form-control" id="marcaIdInput" value="${art.marcas_id}">
		  	</div>
		  	<div class="mb-3" id="divCategoriaId" >
			  <label for="categoriaIdInput" class="form-label">ID Categoria</label>
			  <input type="text" class="form-control" id="categoriaIdInput" value="${art.categorias_id}">
		  	</div>
		  	<div class="mb-3" id="divFechaCreacion" >
			  <label for="categoriaIdInput" class="form-label">Fecha Creacion</label>
			  <input type="text" class="form-control" id="fechaCreacionInput" value="${art.fecha_creacion}">
		  	</div>			  	
		  <button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	`
	const articuloModal = new bootstrap.Modal(document.getElementById('formArtModal'))
	articuloModal.show();
}

function abrirFormCatg(id){
	
	const data = {
		"categorias": [
			{
				"id": 1,
				"descripcion":"categoria1",
				"codigo": "cat000",
				"habilitada": 1
			},			
			{
				"id": 2,
				"descripcion":"categoria2",
				"codigo": "cat001",
				"habilitada": 1
			}
		]
	};
	
	let catg;
	
	for (let categoria of data.categorias){
		if(categoria.id === id){
			catg = categoria;
		}
	};
	
	let categoriaModalBody = document.getElementById('formCatgModal');
	
	categoriaModalBody.innerHTML = 
	`
		<form>
			<div class="mb-3" id="divDescripcion" >
				<span id=${catg.id}></span>
				<label for="descripcionInput" class="form-label">Descripcion'</label>
				<input type="text" class="form-control" id="descripcionInput" value="${catg.descripcion}">
		  	</div>
		  	<div class="mb-3" id="divCodigo" >
			  <label for="codigoInput" class="form-label">Codigo</label>
			  <input type="text" class="form-control" id="codigoInput" value="${catg.codigo}">
		  	</div>
		  	<div class="mb-3" id="divHabilitada" >
			  <label for="habilitadaInput" class="form-label">Habilitada</label>
			  <input type="text" class="form-control" id="habilitadaInput" value="${catg.habilitada}">
		  	</div>			  	
		  <button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	`
		
	const categoriaModal = new bootstrap.Modal(document.getElementById('formCatgModal'))
	categoriaModal.show();
}