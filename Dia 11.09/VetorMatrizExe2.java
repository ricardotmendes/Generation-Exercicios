package Turma9.AulaGeneration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VetorMatrizExe2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		List<Integer> numerosPares = new ArrayList<>();
		List<Integer> numerosImpares = new ArrayList<>();
		
		int n;
		int v[] = new int[6];
		int i; 
		int somaPares=0;
		
		for(i=0;i<6;i++) {
			System.out.println("Insira um número: ");
			n = ler.nextInt(); 
			
			if (n%2==0) {
				numerosPares.add(n);
				somaPares = somaPares+n;
				;
			}
			else {
				numerosImpares.add(n);
				
			}
		}
		
		System.out.println("Números pares digitados: " + numerosPares);

	       System.out.println("Soma dos números pares: " + somaPares);

	       System.out.println("Números ímpares digitados: " + numerosImpares);

	       System.out.println("Quantidade de ímpares digitados: " + numerosImpares.size());
		
				
	}
}
