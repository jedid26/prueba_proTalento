package models;

public class ImgCarrousel {
	
	private Integer id;
	private String descripcion;
	private String imagenUrl;
	private Integer activo;
	
	//Constructor
	public ImgCarrousel(Integer id, String descripcion, String urlImagen, Integer activo) {
		this.id = id;
		this.descripcion = descripcion;
		this.imagenUrl = urlImagen;
		this.activo = activo;
	}

	//Getters y Setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getId() {
		return id;
	}
	
	
	
	
}
