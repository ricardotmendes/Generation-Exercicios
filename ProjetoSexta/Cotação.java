package ProjetoSexta;
	import java.util.*;
public class Cota��o extends PlanoOdontologico{
				
		Scanner ler = new Scanner(System.in);
		
		
		//Question�rio Cliente
		public void pegarNome() {			
			System.out.println("Por favor informe seu nome: ");
			super.setNome(ler.next());
			}
		
		public void pegarEmail() {			
			System.out.println("Seu email: ");
			super.setEmail(ler.next());
			}
		
		
		//M�todo para obter o valor dos planos
		public void pegarInfoTaxa() {			
			System.out.println("Para quantas pessoas? ");
			super.setQuantidade(ler.nextInt());
			
			if (getQuantidade()==1) {
				System.out.println("Sua idade: ");
				super.setIdade(ler.nextInt());
				}
			}
		
		//Fim do Question�rio
		
		
		
	
		// Or�amento Individual - tabela de valores por idade
		public void orcamentoIndividual() {
			
			// Infantil (5 anos a 11 anos)
			if (getIdade() >= 5 && getIdade() < 12) {
				double orcamento = 100;
				System.out.printf("O valor do seu or�amento � de: R$ " + orcamento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			// Juvenil (12 anos a 17 anos)
			if (getIdade() >= 12 && getIdade() < 18) {
				double orcamento = 120;
				System.out.printf("O valor do seu or�amento � de: R$ " + orcamento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			// Adulto (18 anos a 60 anos)
			if (getIdade() >= 18 && getIdade() < 60) {
				double orcamento = 150;
				System.out.printf("O valor do seu or�amento � de: R$ " + orcamento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			// Terceira Idade (60 anos ou mais)
			if (getIdade() > 60 && getIdade() < 120) {
				double orcamento = 140;
				System.out.printf("O valor do seu or�amento � de: R$ " + orcamento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
		}
		
		
			
		// Or�amento Coletivo - tabela de valores por quantidade
		public void or�amentoFamilia() {
			
			if(getQuantidade()==2) {
				double or�amento = 2*140;
				System.out.printf("O valor do seu or�amento ficou R$ "+or�amento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			if(getQuantidade()==3) {
				double or�amento = 3*130;
				System.out.printf("O valor do seu or�amento ficou R$ "+or�amento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			
			if(getQuantidade()==4) {
				double or�amento = 4*120;
				System.out.printf("O valor do seu or�amento ficou R$ "+or�amento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			if(getQuantidade()==5) {
				double or�amento = 5*110;
				System.out.printf("O valor do seu or�amento ficou R$ "+or�amento);
				System.out.println("\nPara mais informa��es, entre em contato com um dos nossos consultores pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			
			if(getQuantidade()>5) {
				System.out.println("Para essa quantidade, por favor entre em contato com nosso consultores para uma condi��o especial!!\nNossos contatos pelo nosso Fale Conosco ou pelo WhatsApp (11) xxxxx-xxxx");
			}
			
		}	
		
		//M�todo para mostrar or�amento
		public void mostrarOr�amento() {
			if(getQuantidade() ==1) {
				orcamentoIndividual();
			} else {
				or�amentoFamilia();
			}
			
		}
		
			
}
