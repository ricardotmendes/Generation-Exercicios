package ProjetoSexta;
	import java.util.*;
public class Cota��o extends PlanoOdontologico{
	
		Scanner ler = new Scanner(System.in);
			
		public void pegarNome() {
			
			System.out.println("Por favor informe seu nome: ");
			super.setNome(ler.next());
			
			
			}
		
		public void pegarEmail() {
			
			System.out.println("Seu emai: ");
			super.setEmail(ler.next());
						
			}
		public void pegarIdade() {
			
			System.out.println("Por favor informe seu nome: ");
			super.setIdade(ler.nextInt());
			
			
			}
		
public void pegarQuantidade() {
			
			System.out.println("O plano � individual? Se n�o, por favor para quantas pessoas est� interessado(a) :");
			super.setQuantidade(ler.nextInt());
			
			
			}
		
}
