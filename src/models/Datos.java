package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Datos {
	
	public Set<String> ocupacion = new HashSet<String>();
	public Map<String, Persona> personasRegistradas = new HashMap<String, Persona>();
	
	
	public boolean registrarPersona(Persona nuevaPersona) {
		ocupacion.add("Estudia");
		ocupacion.add("Trabaja");
		try {
			personasRegistradas.put(nuevaPersona.getDocumento(), nuevaPersona);
			return true;
		} catch (NullPointerException e) {
			System.out.println("Pasaste valores vacíos");
			return false;
		}	
	}
	
	
	
}
