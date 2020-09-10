package Turma9.AulaGeneration;

import java.util.*;

public class RepetiçãoExe3 {
	public static void main (String args[])
	{
		int idade,totalmenor=0,totalmaior=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Entre com a sua idade: ");
		idade = ler.nextInt();
		System.out.println("Para encerrar o programa digite (-99)");
		
		while(idade!=-99) {
			if (idade<21) {
				totalmenor++;
			}
			if (idade>50) {
				totalmaior++;
			}
			System.out.printf("Entre com a sua idade: ");
			idade = ler.nextInt();
		}
		
		
		System.out.println("Total de pessoas com menos de 21 é : "+totalmenor+"\nTotal de pessoas com mais de 50 é: " +totalmaior);
	}
}
