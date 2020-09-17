package POO;

public class TesteAnimal {
	public static void main (String args[]) {
	
	Cachorro cao = new Cachorro();
	cao.setNome("Dalila");
	cao.setIdade(10);
	
	Cavalo cavalo = new Cavalo();
	cavalo.setNome("Spirit");
	cavalo.setIdade(7);
	
	Preguiça preguiça = new Preguiça();
	preguiça.setNome("Ricardo");
	preguiça.setIdade(5);
	
	
	cao.emitirSom();
	cavalo.emitirSom();
	preguiça.emitirSom();
	
}
	}
		
		
		
	

