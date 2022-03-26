package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Datos {
	
	public static Set<String> ocupaciones = new HashSet<String>();
	public Map<String, Persona> personasRegistradas = new HashMap<String, Persona>();
	
	public static void cargarOcupaciones() {
		ocupaciones.add("Estudia");
		ocupaciones.add("Trabaja");
	}
	
	public boolean registrarPersona(Persona nuevaPersona) {
		try {
			personasRegistradas.put(nuevaPersona.getDocumento(), nuevaPersona);
			return true;
		} catch (NullPointerException e) {
			System.out.println("Pasaste valores vacíos");
			return false;
		}	
	}
	
	
	
}
