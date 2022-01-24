package prueba_proTalento;

public class App {

	public static void main(String[] args) {
		
		Menu MenuUsuario = new Menu();
		String opt = MenuUsuario.Option1();
		MenuUsuario.menuCrud(opt);
	}

}
