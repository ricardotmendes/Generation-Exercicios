package POO;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	
	public Vendedor(String nome,String endere�o, String cpf, int telefone, int idade, double valorVendas, double comissao) {
		super(nome,endere�o, cpf, telefone, idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	
	public void mostraInfo() {
		System.out.println("\nNome Vendedor: "+getNome()+"Endere�o: "+getEndereco()+"\nCPF: "+getCpf()+"\nTelefone: "+getTelefone()+"\nIdade: "+getIdade()+"\nValor das vendas no m�s: "+getValorVendas()+"\nComiss�o: "+getComissao());
	}
	
	
	public void valorRecebido() {
		
		double valor = getValorVendas()*(getComissao()/100);
		System.out.println("\n O vendedor "+getNome()+" recebeu de suas vendas o valor de : R$"+valor);
	}

	public double getValorVendas() {
		return valorVendas;
	}


	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
