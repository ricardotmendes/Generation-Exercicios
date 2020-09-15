package POO;

public class Cliente {
	private String nome;
	private int idade;
	private boolean possuiCadastro;
	
	protected Cliente(String nomecliente, int idadecliente,boolean possuiCadastro) {
		
		this.nome = nomecliente;
		this.idade = idadecliente;
		this.possuiCadastro = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isPossuiCadastro() {
		return possuiCadastro;
	}

	public void setPossuiCadastro(boolean possuiCadastro) {
		this.possuiCadastro = possuiCadastro;
	}
	
	public void mostrar()
	{
		System.out.println("Nome do cliente: " + this.getNome());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Possui cadastro: " + this.isPossuiCadastro());
	}
	
}
