package torre_control;

public class Torre_control_main {

	public static void main(String[] args) {
		
		Avion avion1 = new Avion("boening-747", false, 747, "civil");
		Avion avion2 = new Avion("f-35", false, 2,"militar");
		Helicoptero heli1 = new Helicoptero("apache", false, 2, "militar");
		Helicoptero heli2 = new Helicoptero("Eurocopter", false, 10, "civil");
		Superman superMan = new Superman("Clark Kent", true);
		Ovni ufo1 = new Ovni("desconocido", false);
		Ovni ufo2 = new Ovni("desconocido", false);
		
		Voladores[] traficoAereo = new Voladores[7];
		traficoAereo[0] = avion1;
		traficoAereo[1] = avion2;
		traficoAereo[2] = heli1;
		traficoAereo[3] = heli2;
		traficoAereo[4] = superMan;
		traficoAereo[5] = ufo1;
		traficoAereo[6] = ufo2;
		
		for (Voladores volador : traficoAereo) {
			if(volador instanceof Aterrizable) {	
				if (volador instanceof Avion) {
					if(((Avion) volador).getTipo_avion() == "civil") {
						System.out.println(volador.getNombre() +" Aterrizar en pista 2 - civiles");
					} else {
						System.out.println(volador.getNombre() + " Aterrizar en pista 1 - militar");
					}
				} else if(volador instanceof Helicoptero) {
					if(((Helicoptero) volador).getTipo() == "civil") {
						System.out.println(volador.getNombre() + " Aterrizar en helipuerto 1 - civiles");
					} else {
						System.out.println(volador.getNombre()+ " Aterrizar en helipuerto 2 - militares");
					}
				}
			} else {
				System.out.println("No puede aterrizar "+ volador.getNombre());
				if (volador instanceof Superman) {
					System.out.println("Hay kriptonia en aeropuerto");
				} else {
					System.out.println("Es un OVNI");
				}
			}
			
		}
	}

}
