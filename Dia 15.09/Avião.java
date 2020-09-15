package POO;

public class Avi�o {
	private String origem;
	private String destino;
	private int numAdultos;
	private int numCrian�as;
	private int totPass;
	private int numBagagem;
	
	public Avi�o(String origem, String destino, int numAdultos, int numCrian�as, int numBagagem) {
		
		this.origem = origem;
		this.destino = destino;
		this.numAdultos = numAdultos;
		this.numCrian�as = numCrian�as;
		this.numBagagem = numBagagem;
		this.totPass =numAdultos+numCrian�as;
		
	}
	
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumAdultos() {
		return numAdultos;
	}

	public void setNumAdultos(int numAdultos) {
		this.numAdultos = numAdultos;
	}

	public int getNumCrian�as() {
		return numCrian�as;
	}

	public void setNumCrian�as(int numCrian�as) {
		this.numCrian�as = numCrian�as;
	}



	public int getNumBagagem() {
		return numBagagem;
	}

	public void setNumBagagem(int numBagagem) {
		this.numBagagem = numBagagem;
	}
	
	
	
	
	public void mostrar() {
		System.out.println("Esse avi�o tem como Origem "+this.getOrigem()+" e Destino "+this.getDestino()+"\nO total de passageiros � de "+this.totPass+".\n Entre eles temos "+this.getNumAdultos()+" adultos e "+this.getNumCrian�as()+" crian�as.\nO total de bagagem foi de"+this.getNumBagagem()+" malas");
	}
	
	
	
}
