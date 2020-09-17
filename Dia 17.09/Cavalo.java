package POO;

public class Cavalo extends Animal{

	
	public void emitirSom() {
		
		System.out.println("*Relinchar*");
		
	}
	
	
	
	public void correr() {
		
	}
	
	
	public String getNome() {
		return "O nome do cavalinho é"+super.getNome();
	}
	
	public int getIdade(){
		return super.getIdade();
	}
}
