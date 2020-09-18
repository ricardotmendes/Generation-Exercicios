package ProjetoSexta;

public class TestePlanoOdontologico {
	public static void main (String args[]) {
		
		Cotação cotacao = new Cotação();
		
		cotacao.pegarNome();
		cotacao.pegarEmail();
		cotacao.pegarIdade();
		cotacao.pegarQuantidade();
		
		cotacao.orçamentoFinal();
		
	}
}
