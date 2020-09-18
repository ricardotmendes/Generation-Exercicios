package ProjetoSexta;
	import java.util.*;
public class Cotação extends PlanoOdontologico{
		
		 
		
		Scanner ler = new Scanner(System.in);
		int planoInfantil = 100;
		int planoJuvenil = 130;
		int planoAdulto = 140;
		int planoSenior = 160; 
		
		
		public void pegarNome() {			
			System.out.println("Por favor informe seu nome: ");
			super.setNome(ler.next());
			}
		
		public void pegarEmail() {			
			System.out.println("Seu email: ");
			super.setEmail(ler.next());
			}
		
		public void pegarQuantidade() {			
			System.out.println("Para quantas pessoas? ");
			super.setQuantidade(ler.nextInt());
			}
		
		public void pegarIdade() {			
			
			System.out.println("Sua idade: ");
			super.setIdade(ler.nextInt());
			}
		
		
		
		public void orçamentoFinal() {
			
			if(getQuantidade()==2) {
				double getOrçamento = 2*140;
				System.out.printf("O valor do seu orçamento ficou R$ "+getOrçamento);
			}
		}	
		
			
}
