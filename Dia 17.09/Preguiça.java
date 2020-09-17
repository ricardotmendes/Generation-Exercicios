package POO;

public class Preguiça extends Animal{

	
	public void emitirSom() {
		
		System.out.println("*Sons de preguiça*");
		
	}
	
	public void subirEmArvores() {
		
	}
	
	
	public String getNome() {
		return "O nome da preguicinha é"+super.getNome();
	}
	
	public int getIdade(){
		return super.getIdade();
	}
}
