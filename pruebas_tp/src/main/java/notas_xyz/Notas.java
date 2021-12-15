package notas_xyz;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos a procesar: ");
		int numEstudiantes = input.nextInt();
		String [][] dataEstudiante = new String[numEstudiantes][4];
		
		for (int i=0; i < numEstudiantes; i++) {
			
			System.out.println("Ingrese los datos del estudiante "+ i);
		
			for (int j = 0; j < 4; j++) {
				
				int notas = 0;
				float promedio = 0;
				input.nextLine();
				System.out.println("Nombre del estudiante: ");
				dataEstudiante[i][0] = input.next();
				System.out.println("Apellido del estudiante: ");
				dataEstudiante[i][1] = input.next();
				System.out.println("Número de examen: ");
				dataEstudiante[i][2] = input.next();
				
				for (int j2 = 0; j2 < Integer.parseInt(dataEstudiante[i][2]); j2++) {
					
					System.out.println("Nota examen "+ j2 + ":");
					int nota = input.nextInt();
					notas = notas + nota;
				}
				promedio = notas/Integer.parseInt(dataEstudiante[i][2]);
				dataEstudiante[i][3] = String.valueOf(promedio);
			}
		}
			
		int mayor=0, menor=0, posMayor=0, posMenor=0;
			
		for (int j = 0; j < dataEstudiante.length; j++) {
			if (Float.parseFloat(dataEstudiante[j][3]) > mayor) {
				posMayor = j;
			} else if (Float.parseFloat(dataEstudiante[j][3]) < menor) {
				posMenor = j;
			}		
		}
		System.out.println("1. Calificación mayor: "+ dataEstudiante[posMayor][0]+" "+dataEstudiante[posMayor][1]+ " " +dataEstudiante[posMayor][3]);
		System.out.println("1. Calificación menor: "+ dataEstudiante[posMenor][0]+" "+dataEstudiante[posMenor][1]+ " " +dataEstudiante[posMenor][3]);
		System.out.println("Estudiantes que aprueban: ");
		for (int i = 0; i < dataEstudiante.length; i++) {
			if ( Float.parseFloat(dataEstudiante[i][3]) >= 7) {
				System.out.println(dataEstudiante[i][0]+" "+dataEstudiante[i][1]);
			}
		}
		System.out.println("Estudiantes que recursan: ");
		for (int i = 0; i < dataEstudiante.length; i++) {
			if ( Float.parseFloat(dataEstudiante[i][3]) < 7) {
				System.out.println(dataEstudiante[i][0]+" "+dataEstudiante[i][1]);
			}
		}
		
		input.close();
	}
	
}
