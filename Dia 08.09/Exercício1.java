package Turma9.AulaGeneration;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String args[])
	{
		int anos, meses,dias,totalDias;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Informe sua idade em anos: ");
			anos= ler.nextInt();
			System.out.println("Informe sua idade em meses: ");
			meses= ler.nextInt();
			System.out.println("Informe sua idade em dias: ");
			dias= ler.nextInt();
			
			totalDias = dias+(anos*365)+(meses*30);
			
			System.out.println("O total de dias da idade informada é "+ totalDias);
	}
}
