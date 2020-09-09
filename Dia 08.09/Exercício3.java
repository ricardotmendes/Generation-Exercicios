package Turma9.AulaGeneration;

import java.util.Scanner;

public class Exercício3 {
	public static void main (String args[])
	{
		int totSeg,horas,minutos,segundos;
		
		Scanner ler = new Scanner(System.in);
				
				System.out.println("Informe os segundos aqui: ");
				totSeg= ler.nextInt();
				
				horas = (totSeg/3600);
				minutos = (totSeg%3600)/60;
				segundos = (totSeg%3600)%60;
				
				System.out.println("A duração do evento na fábrica dura exatamente\n"+ horas+ " horas\n"+minutos+" minutos\n"+segundos+" segundos");
						
				
	}
}
