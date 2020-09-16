package POO;

public class Administrador extends Pessoa{
	
	private double custoViagem;
	private double estadias;
	
	public Administrador(String nome,String endereço, String cpf, int telefone, int idade, double cusVia, double est) {
		super(nome,endereço, cpf, telefone, idade);
		this.custoViagem=cusVia;
		this.estadias = est;


		
		
	}
	
	public void mostraInfo() {
		System.out.println("\nNome Administrador: "+getNome()+"Endereço: "+getEndereco()+"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nIdade: "+getIdade()+"\nCusto da viagem: "+getCustoViagem()+"\nCusto Estadias: "+getEstadias());
	}

	public void AjudaDeCusto() {
		double ajuda = this.custoViagem + this.estadias;
		System.out.println("A ajuda de custo foi de "+ajuda);
	}
	
	

	public double getCustoViagem() {
		return custoViagem;
	}

	public void setCustoViagem(double custoViagem) {
		this.custoViagem = custoViagem;
	}

	public double getEstadias() {
		return estadias;
	}

	public void setEstadias(double estadias) {
		this.estadias = estadias;
	}
	
	
}

