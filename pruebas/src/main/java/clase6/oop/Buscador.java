package clase6.oop;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados;
	private Integer cantidadResultados;
	
	//Constructor
	public Buscador() {
		System.out.println("Creando buscador");
	}
	
	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Articulo[] getResultados() {
		return resultados;
	}
	
	public Integer getCantidadResultados() {
		if (this.cantidadResultados == null)
			return cantidadResultados = 0;
		else 
			return this.cantidadResultados;
	}

	public void setCantidadResultados(Integer cantidadResultados) {
		this.cantidadResultados = cantidadResultados;
	}

	void buscar() {
		System.out.println("buscando..." + this.claveBusqueda);
		
		// como mi buscador necesita usar un objeto de la clase DB
		// debe instanciar un objeto de dicha clase
		DB db = new DB();
		
		this.resultados = db.consultar(claveBusqueda);
		
		this.setCantidadResultados(this.resultados.length);
	}

	void mostrarResultados() {
		if(this.resultados.length > 0) {
			for(Articulo aux : this.resultados ) {
				aux.detalleArticulo();
			}
		}else {
			System.out.println("No hay resultados para " + this.claveBusqueda);
		}
	}
	
	
	
}