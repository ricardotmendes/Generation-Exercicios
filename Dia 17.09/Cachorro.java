package POO;

public class Cachorro extends Animal{
		
		 
	
	
	public void emitirSom() {	
		
		System.out.println("*Latidos*");
		
	}
	
	public void correr() {
	 	
	}
	
	public String getNome() {
		return "O nome do doguinho �"+super.getNome();
	}
	
	public int getIdade(){
		return super.getIdade();
	}
}
