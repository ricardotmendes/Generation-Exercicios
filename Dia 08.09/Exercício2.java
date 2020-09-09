package Turma9.AulaGeneration;
import java.util.Scanner;

public class Exercício2 {
	public static void main (String args[])
	{
		int totDias,dias,meses,anos;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Informe sua idade em quantidade de dias: ");
			totDias = ler.nextInt();
			
			anos = (totDias/365);
			meses = (totDias%365)/30;
			dias = (totDias%365)%30;
			
			System.out.println("A idade informada é de "+anos+" anos, "+meses+" meses e "+dias+" dias.");
			
			
					
			
		
	}

}
