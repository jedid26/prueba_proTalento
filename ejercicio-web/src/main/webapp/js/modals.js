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
	
	//Manejo modals
	const myModal = new bootstrap.Modal(document.getElementById('tablasModal'))
	myModal.show();
	
	let tablaArt = document.getElementById('tablaArtBody');
	
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
			  	<button type="button" class="btn btn-info">Abrir modal</button>
			  </td>	
		    </tr>
		`
	};
	
	let tablaCatg = document.getElementById('tablaCatgBody');
	
	for (let catg of data.categorias){
		tablaCatg.innerHTML = tablaCatg.innerHTML +
		`
			<tr>
		      <th scope="row">${catg.id}</th>
		      <td>${catg.descripcion}</td>
		      <td>${catg.codigo}</td>
		      <td>${catg.habilitada}</td>
		      <td>
			  	<button type="button" class="btn btn-info">Abrir modal</button>
			  </td>	
		    </tr>
		`
	}
};