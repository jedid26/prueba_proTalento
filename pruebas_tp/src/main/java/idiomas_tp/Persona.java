package idiomas_tp;

import java.util.Set;

public class Persona extends Entidad implements IPersona {
	
	//Atributos
	public Set<String> idiomasAprendidos;	
	
	//Constructor
	public Persona(String nombre, String idiomaNativo) {
		super(nombre, idiomaNativo);
	}
	
	//Metodos de interfaz
	public void aprenderIdioma(String idioma) throws FenomenoException {
		if (Persona.this.getIdiomaNativo() == idioma) {
			throw new FenomenoException("Es idioma nativo");
		}
		idiomasAprendidos.add(idioma);		
	}


}
