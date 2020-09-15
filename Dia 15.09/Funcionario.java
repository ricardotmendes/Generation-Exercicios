package POO;

public class Funcionario {
	private String nome;
	private int salario;
	private int horasExtras;
	private double totRecebido;
	
	public Funcionario(String nome,int salario, int horasExtras) {
		this.nome = nome;
		this.salario = salario;
		this.horasExtras = horasExtras;
		this.totRecebido = salario+(176*horasExtras/10);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTotRecebido() {
		return totRecebido;
	}

	public void setTotRecebido(int totRecebido) {
		this.totRecebido = totRecebido;
	}
	
	
	public void fazmerir() {
		System.out.println("Funcionário: "+this.getNome()+"\nSalário: "+this.getSalario()+"\nHoras extras: "+this.getHorasExtras()+"\nRecebidos Valor Total: "+this.getTotRecebido());
		
	}
}
