package prueba_proTalento;

public class Alumno {
	private static Integer matriculaSiguiente= 1;
	private Integer matricula;
	private String nombre;
	private String apellido;
	
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matriculaSiguiente;
		matriculaSiguiente++;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
