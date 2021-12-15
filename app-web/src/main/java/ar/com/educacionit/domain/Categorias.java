package ar.com.educacionit.domain;

public class Categorias {
	
	//atributos
	private Long id;
	private String descripcion;
	private String codigo;
	
	// constructor alt + shift + s
	public Categorias(Long id, String descripcion, String codigo) {
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	// constructor
	public Categorias(String descripcion, String codigo) {
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	//GETTERS, SETTERS 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	//metodos
	
	
	
}
