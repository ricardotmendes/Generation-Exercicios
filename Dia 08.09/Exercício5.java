package Turma9.AulaGeneration;
import java.util.Scanner;

public class Exercício5 {
	public static void main (String args[])
	{
		double nota1,nota2,nota3,media;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Entre com a primeira nota: ");
			nota1 = ler.nextInt();
			System.out.println("Entre com a segunda nota: ");
			nota2 = ler.nextInt();
			System.out.println("Entre com a terceira nota: ");
			nota3 = ler.nextInt();
		
			media = (nota1*1)+(nota2*3)+(nota3*5)/10;
			
			System.out.println("A média ponderada é: "+media);
		
	}
}
