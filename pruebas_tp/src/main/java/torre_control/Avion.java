package torre_control;

public class Avion extends Voladores implements Aterrizable {
	
	protected int tripulantes;
	protected String tipo_avion; //Civil o militar
	
	//Constructor
	public Avion(String nombre, boolean esOrganico, int tripulantes, String tipo_avion) {
		super(nombre, esOrganico);
		this.tripulantes = tripulantes;
		this.tipo_avion = tipo_avion;
	}

	//Contrato
	public boolean aterrizar(String tipo) {
		if (tipo.toLowerCase() == "civil") {
			System.out.println("Aterrizar en pista: "+tipo);
			return true;
		} else if (tipo.toLowerCase()== "militar") {
			System.out.println("Aterrizar en pista: "+tipo);
			return true;
		} else {
			System.out.println("No se reconoce");
			return false;
		}
	}
	
	//Getter & Setters
	public int getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(int tripulantes) {
		this.tripulantes = tripulantes;
	}

	public String getTipo_avion() {
		return tipo_avion;
	}

	public void setTipo_avion(String tipo_avion) {
		this.tipo_avion = tipo_avion;
	}
	
}
