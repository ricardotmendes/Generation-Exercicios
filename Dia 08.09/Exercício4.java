package Turma9.AulaGeneration;
import java.util.Scanner;

public class Exerc�cio4 {
	public static void main (String args[])
	{
		int A,B,C;
		double R,S,D;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Entre com o valor de A: ");
			A = ler.nextInt();
			System.out.println("Entre com o valor de B: ");
			B = ler.nextInt();
			System.out.println("Entre com o valor de C: ");
			C = ler.nextInt();
		
			R=(A+B);
			S=(B+C);
			
			Math.pow(R,2);
			Math.pow(S,2);
			
			D = Math.pow(R,2) + Math.pow(S,2)/2;
			
			System.out.println("O valor de D � : "+D);
			
			
			
			
	}
	
}
