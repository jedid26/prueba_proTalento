package idiomas_tp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Persona extends Entidad implements IPersona {
	
	//Atributos
	public Set<String> idiomasAprendidos = new HashSet<String>();	
	
	//Constructor
	public Persona(String nombre, String idiomaNativo) {
		super(nombre, idiomaNativo);
	}
	
	//Metodos de interfaz
	public void aprenderIdioma(String idioma) throws FenomenoException {
		idiomasAprendidos.add(idioma);
		if (Persona.this.getIdiomaNativo() == idioma) {
			throw new FenomenoException("Ya sabe el idioma");
		}	
	}
	
	//Metodo para listar idiomas aprendidos por la persona
	public String verIdiomasAprendidos() {
		String idiomas = "";
		Iterator<String> idiomaIterator = idiomasAprendidos.iterator();
		
		//Tiene siguiente?
		while (idiomaIterator.hasNext()) {
			idiomas.concat(idiomaIterator.next()+" ");
		}
		return idiomas;
	}
	
	//Metodo para saber si persona ya sabe el idioma
	public Boolean sabeIdioma(String idioma) {
		Iterator<String> idioIterator = idiomasAprendidos.iterator();
		while (idioIterator.hasNext()) {
			if (idioIterator.next() == idioma) {
				return true;
			}
		}	
		return false;	
	}


}
