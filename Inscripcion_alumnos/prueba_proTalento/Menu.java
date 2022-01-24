package prueba_proTalento;

import java.util.Scanner;

public class Menu {
	
	//"Conexión" base de datos
	DatosDBMemoria database = null;
	//Teclado
	Scanner teclado = new Scanner(System.in);
	//Option manejará el tipo de gestión, opt1 -> nivel gestión clase | opt2 -> nivel crud de op1
	int opt1, opt2;
	
	public String Option1() {
		
		//Variable centinela
		int sentinel = 0;
		do {
			System.out.println("Sistema de inscripción (Digite el número de la operación que desea realizar)"+"\n 1.Gestión Alumnos" +"\n 2.Gestión Materias"+"\n 3.Salir");
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
		
		//Variable centinela
		int sentinel2 = 0;
		String optionCrud = null;
		
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
			if (opt2 >= 1 || opt2 <= 4) {
				sentinel2 = 1;
				break;
			}
		} while(sentinel2 == 0);	
	}	
	
	public DatosDBMemoria Create(String option) {
		if (option == "alumno") {
			System.out.println("Registrar nuevo");
			System.out.println("Ingrese la cantidad de estudiantes a registrar: ");
			int numEstudiantes = teclado.nextInt();
			teclado.nextLine();
			Alumno[] datos = new Alumno[numEstudiantes];
			for (int i=0; i<numEstudiantes; i++) {
					System.out.println("Estudiante "+(i+1));
					System.out.println("Nombre de estudiante: ");
					String nombre = teclado.nextLine();
					System.out.println("Apellido del estudiante: ");
					String apellido = teclado.nextLine();
					datos[i] = new Alumno(nombre, apellido);
			}
			database.setAlumnosData(datos);
			return database;
		} else {
			System.out.println("Registrar nueva");
			System.out.println("Ingrese la cantidad de materias a registrar: ");
			int numMaterias = teclado.nextInt();
			Materia[] datos = new Materia[numMaterias];
			for (int i=0; i<numMaterias; i++) {
					System.out.println("Nombre del curso: ");
					String curso = teclado.nextLine();
					System.out.println("Hora del turno: ");
					String turno = teclado.nextLine();
					datos[i] = new Materia(curso, turno);
			}
			database.setMateriaData(datos);
			return database;
		}
	}
		
	
	public void Read(String option) {
		int filter;
		if (option == "alumno") {
			System.out.println("Consultar por (Ingrese un filtro de busqueda) "+
					"\n 1.Nombre (Devuelve todas las coincidencias)"+
					"\n 2.Matricula (Devuelve un solo estudiante)"+
					"\n 3.Todos (Devuelve todos los estudiantes)");
			filter = teclado.nextInt();
			if (filter == 1) {
				String nombre;
				System.out.println("Buscando por nombre" + "\n Ingrese el nombre del estudiante");
				nombre = teclado.nextLine();
				database.getAlumnosData();
			}
			
			
		} else {
			System.out.println("Consultar por (Ingrese un filtro de busqueda) "+
					"\n 1.Nombre (Devuelve todas las coincidencias)"+
					"\n 2.Hora de turno (Devuelve un solo estudiante)"+
					"\n 3.Todos (Devuelve todos los estudiantes)");
			filter = teclado.nextInt();
		}
	}
	
	public DatosDBMemoria Update(DatosDBMemoria data, String option) {
		if (option == "alumno") {
			System.out.println("Ingrese matrícula del alumno: ");
			String filter = teclado.nextLine();
			Alumno[] dataAlumnos = data.getAlumnosData();
			for (int i = 0; i<dataAlumnos.length;i++) {
				if (dataAlumnos[i].getMatricula() == Integer.parseInt(filter)) {
					System.out.println("Ingrese nuevo nombre del estudiante: ");
					String newNombre = teclado.nextLine();
					dataAlumnos[i].setNombre(newNombre);
					System.out.println("Ingrese nuevo apellido del estudiante: ");
					String newApellido = teclado.nextLine();
					dataAlumnos[i].setApellido(newApellido);
				}
			}
		} else {
			System.out.println("Ingrese código de materia a eliminar: ");
		}
		
		
		
		return data;
	}
	
	public DatosDBMemoria Delete(DatosDBMemoria data, String option) {
		if (option == "alumno") {
			System.out.println("Ingrese el nombre del alumno a eliminar: ");
			String filter =  teclado.nextLine();
			Alumno[] dataAlumnos = data.getAlumnosData();
			for (int i=0; i<dataAlumnos.length;i++) {
				if (dataAlumnos[i].getNombre().equalsIgnoreCase(filter)) {
					dataAlumnos[i] = null;
				}
			}
			data.setAlumnosData(dataAlumnos);
		} else {
			System.out.println("Ingrese el nombre de la materia a eliminar: ");
			String filter = teclado.nextLine();
			Materia[] dataMaterias = data.getMateriaData();
			for (int i=0; i<dataMaterias.length;i++) {
				if (dataMaterias[i].getCurso().equalsIgnoreCase(filter)) {
					dataMaterias[i] = null;
				}
			}
			data.setMateriaData(dataMaterias);
		}
		return data;
	}
					
			
}
