package prueba_proTalento;

public class DatosDBMemoria {
	
	private Alumno[] alumnosData;
	private Materia[] materiaData;
	
	public DatosDBMemoria(Alumno[] alumnosData, Materia[] materiaData) {
		this.alumnosData = alumnosData;
		this.materiaData = materiaData;
	}

	public Alumno[] getAlumnosData() {
		return alumnosData;
	}

	public void setAlumnosData(Alumno[] alumnosData) {
		this.alumnosData = alumnosData;
	}

	public Materia[] getMateriaData() {
		return materiaData;
	}

	public void setMateriaData(Materia[] materiaData) {
		this.materiaData = materiaData;
	}
	
	
	
	
	
	
}
