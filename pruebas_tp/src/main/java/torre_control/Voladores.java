package torre_control;

public abstract class Voladores {
	protected String nombre;
	protected boolean esOrganico;
	
	//Constructor
	public Voladores(String nombre, boolean esOrganico) {
		this.nombre = nombre;
		this.esOrganico = esOrganico;
	}
	
	//Getter & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsOrganico() {
		return esOrganico;
	}

}
