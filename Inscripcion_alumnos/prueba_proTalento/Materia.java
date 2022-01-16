package prueba_proTalento;

public class Materia {
	private int id;
	private static int idSiguiente = 1;
	private String curso;
	private String turno;
	
	public Materia(String curso, String turno) {
		this.curso = curso;
		this.turno = turno;
		this.id = idSiguiente;
		idSiguiente++;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getId() {
		return id;
	}
		
}
