package POO;

public class Avião {
	private String origem;
	private String destino;
	private int numAdultos;
	private int numCrianças;
	private int totPass;
	private int numBagagem;
	
	public Avião(String origem, String destino, int numAdultos, int numCrianças, int numBagagem) {
		
		this.origem = origem;
		this.destino = destino;
		this.numAdultos = numAdultos;
		this.numCrianças = numCrianças;
		this.numBagagem = numBagagem;
		this.totPass =numAdultos+numCrianças;
		
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

	public int getNumCrianças() {
		return numCrianças;
	}

	public void setNumCrianças(int numCrianças) {
		this.numCrianças = numCrianças;
	}



	public int getNumBagagem() {
		return numBagagem;
	}

	public void setNumBagagem(int numBagagem) {
		this.numBagagem = numBagagem;
	}
	
	
	
	
	public void mostrar() {
		System.out.println("Esse avião tem como Origem "+this.getOrigem()+" e Destino "+this.getDestino()+"\nO total de passageiros é de "+this.totPass+".\n Entre eles temos "+this.getNumAdultos()+" adultos e "+this.getNumCrianças()+" crianças.\nO total de bagagem foi de"+this.getNumBagagem()+" malas");
	}
	
	
	
}
