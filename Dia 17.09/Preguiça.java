package POO;

public class Pregui�a extends Animal{

	
	public void emitirSom() {
		
		System.out.println("*Sons de pregui�a*");
		
	}
	
	public void subirEmArvores() {
		
	}
	
	
	public String getNome() {
		return "O nome da preguicinha �"+super.getNome();
	}
	
	public int getIdade(){
		return super.getIdade();
	}
}
