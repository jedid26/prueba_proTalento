package prueba_proTalento;

import java.util.Scanner;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	//Option manejará el tipo de gestión, opt1 -> nivel gestión clase | opt2 -> nivel crud de op1
	int opt1, opt2;
	//Variables centinelas
	int sentinel = 0;
	int sentinel2= 0;
	
	public String Option1() {
		do {
			System.out.println("Sistema de inscripción (Digite el número de la operación que desea realizar)"+"\n 1.Gestión Alumnos" +"\n 2.Gestión Materias");
			teclado.nextLine();
			opt1 = teclado.nextInt();
			
			if (opt1 == 1){
				System.out.println("Ejecutando Gestión Alumnos");
				sentinel = 1;
				return "alumno";
			} else if (opt1 == 2) {
				System.out.println("Ejecutando Gestión Materias");
				sentinel = 1;
				return "materia";
			} else {
				System.out.println("Ingrese una opción válida");
				sentinel = 0;
				return null;
			}
		} while (sentinel == 0);	
	}
	
	public void menuCrud(String option) {
		do {
			System.out.println("Ingrese el número de la opción que desea realizar"+ 
					"\n 1.Registrar "+ option + 
					"\n 2.Consultar "+ option+
					"\n 3.Actualizar datos "+ option+
					"\n 4.Eliminar "+ option);
			opt2 = teclado.nextInt();
			//Debug
			System.out.println(opt2);
			//Comprobación option válida
			if (opt2 < 1 || opt2 > 4) {
				sentinel2 = 0;
				break;
			}
		} while(sentinel2 == 0);
		
		switch(opt2) {
			case 1:
					System.out.println("Registrar nuevo");
					
					for (int i=0; i < Alumno.class.getDeclaredFields().length-1; i++) {
						
					}
					
					break;
			case 2:
					int filter;
					System.out.println("Consultar por (Ingrese un filtro de busqueda) "+
										"\n 1.Nombre (Devuelve todas las coincidencias)"+
										"\n 2.Matricula (Devuelve un solo estudiante)"+
										"\n 3.Todos (Devuelve todos los estudiantes)");
					filter = teclado.nextInt();
					
		}
	}
	
	
}
