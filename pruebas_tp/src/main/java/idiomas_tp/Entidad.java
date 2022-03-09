package idiomas_tp;

public abstract class Entidad {
	
	//Atributos
	protected String nombre;
	protected String idiomaNativo;
	
	//Constructor
	public Entidad(String nombre, String idiomaNativo) {
		this.nombre = nombre;
		this.idiomaNativo = idiomaNativo;
	}
	
	//Getter y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdiomaNativo() {
		return idiomaNativo;
	}
	public void setIdiomaNativo(String idiomaNativo) {
		this.idiomaNativo = idiomaNativo;
	}
	
}
