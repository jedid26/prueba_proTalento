package ar.com.educacionit.domain;

public class Marcas {
	private Long id;
	private String marca;
	private Long habilitado; //1: habilitado - 0: no habilitado
	
	//CONSTRUCTOR
	public Marcas(Long id, String marca, Long habilitado) {
		this.id = id;
		this.marca = marca;
		this.habilitado = habilitado;
	}
	
	public Marcas(String marca, Long habilitado) {
		this.marca = marca;
		this.habilitado = habilitado;
	}
	
	
	//GETTER, SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Long habilitado) {
		this.habilitado = habilitado;
	}
	
	//METODOS
	
	
	
	
}
