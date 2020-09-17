package ProjetoSexta;
	import java.util.*;
public class Cotação extends PlanoOdontologico{
	
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
			
			System.out.println("O plano é individual? Se não, por favor para quantas pessoas está interessado(a) :");
			super.setQuantidade(ler.nextInt());
			
			
			}
		
}
