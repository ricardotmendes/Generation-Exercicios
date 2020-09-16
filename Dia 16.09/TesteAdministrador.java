package POO;

public class TesteAdministrador {
	public static void main(String args[]) { 
		Administrador alberto = new Administrador("Alberto", "Rua das Pamonhas 67", "12345678900", 99999999,40,800,250);
		
		alberto.mostraInfo();
		alberto.AjudaDeCusto();
				
}

}