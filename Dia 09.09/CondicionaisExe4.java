package Turma9.AulaGeneration;
import java.util.*;

public class CondicionaisExe4 {
	public static void main(String args[])
	{
		double n,par,impar;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		n = ler.nextFloat();
		
		par = Math.sqrt(n);
		impar = Math.pow(n, 2);
		
		if (n%2==0)
		
		{
			System.out.println("Este n�mero � PAR!\nE sua raiz quadrada �: "+ par);
			
		}
		else
		{
			System.out.println("Este n�mero � IMPAR!\nE ele elevado ao quadrado � : "+ impar);
		}
	}
}
