package Turma9.AulaGeneration;

import java.util.*;

public class Repeti��oExe5 {
	public static void main(String args[])
	{
		int n,soma=0;
		Scanner ler = new Scanner(System.in);
				
		do {
			System.out.println("Insira um n�mero para ser somado: ");
			n = ler.nextInt();
			soma = soma+n;
				
			if (n==0)
				{
				System.out.println("A soma dos valores inseridos �: "+ soma);
				}
			
		}while(n!=0);
		
			
		
	}
}
