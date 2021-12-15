package torre_control;

public class Helicoptero extends Voladores implements Aterrizable{
	
	protected int tripulantes;
	protected String tipo;
	
	//Constructor
	public Helicoptero(String nombre, boolean esOrganico, int tripulantes, String tipo) {
		super(nombre, esOrganico);
		this.tripulantes = tripulantes;
	}
	
	//Getters & Setters
	public int getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(int tripulantes) {
		this.tripulantes = tripulantes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Contrato
	public boolean aterrizar(String tipo) {
		if(tipo.toLowerCase() == "civil") {
			System.out.println("Aterrizar en helipuerto: "+tipo);
			return true;
		} else if(tipo.toLowerCase() == "militar") {
			System.out.println("Aterrizar en helipuerto: "+tipo);
			return true;
		} else {
			System.out.println("No identificado");
			return false;
		}
	}
}
