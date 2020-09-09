package Turma9.AulaGeneration;
import java.util.*;

public class CondicionaisExe4 {
	public static void main(String args[])
	{
		double n,par,impar;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		n = ler.nextFloat();
		
		par = Math.sqrt(n);
		impar = Math.pow(n, 2);
		
		if (n%2==0)
		
		{
			System.out.println("Este número é PAR!\nE sua raiz quadrada é: "+ par);
			
		}
		else
		{
			System.out.println("Este número é IMPAR!\nE ele elevado ao quadrado é : "+ impar);
		}
	}
}
