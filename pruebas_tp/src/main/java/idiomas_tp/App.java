package idiomas_tp;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		Persona per1 = new Persona("Carlos", "español");
		Persona per2 = new Persona("Maria", "español");
		Persona per3 = new Persona("Merry", "ingles");
		Persona per4 = new Persona("James", "ingles");
		Persona per5 = new Persona("Dimitry", "ruso");
		Persona per6 = new Persona("Bartolome", "italiano");
		Persona per7 = new Persona("Fiona", "italiano");
		Persona per8 = new Persona("Alina", "ruso");
		
		listaPersonas.add(per1);
		listaPersonas.add(per2);
		listaPersonas.add(per3);
		listaPersonas.add(per4);
		listaPersonas.add(per5);
		listaPersonas.add(per6);
		listaPersonas.add(per7);
		listaPersonas.add(per8);
		
		Boolean salir = false;
		
		do {
			int opcion = 0;
			System.out.println("Ingrese una opcion: \n1. Listar personas \n2. Persona aprende idioma \n3. Salir");
			opcion = teclado.nextInt();
			
			switch (opcion) {		
			//Listar personas
			case 1:
				//Capturar idioma para filtrar lista
				System.out.println("Ingrese un idioma para conocer las personas que lo hablan: ");
				String lang = "ingles";
				//String lang = "";
				//String lang = teclado.nextLine();
				
				//Recorrer lista para listar personas
				for (Persona persona : listaPersonas) {
					if (persona.getIdiomaNativo() == lang || persona.sabeIdioma(lang)) {
						System.out.println(persona.getNombre()+" habla "+lang);
					}					
				}
				
				break;
			
			//Persona aprende idioma
			case 2:
				//Recorrer las personas
				for (Persona persona : listaPersonas) {
					System.out.println("Nombre: "+persona.getNombre()+
										"\nIdioma nativo: "+persona.getIdiomaNativo()+
										"\nIdiomas aprendidos: "+persona.verIdiomasAprendidos());
					System.out.println("Ingrese un nuevo idioma para aprender: ");
					try {
						persona.aprenderIdioma("uzbeko");
						System.out.println("Idioma aprendido");
					} catch (FenomenoException e) {
						e.getMessage();
					}
				}
				break;
				
			default:
				salir=true;
				break;
			}
			System.out.println("\n");
		} while (salir == false);
		
		teclado.close();	
	}
}
