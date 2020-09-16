package POO;

public class TesteVendedor {
	public static void main (String args[]) {
		
		Vendedor amanda = new Vendedor("Amanda","Rua dos Pinheiros 498","98745632178",123456789,30,32200, 15);
		
		amanda.mostraInfo();
		amanda.valorRecebido();
		
	}
}
