package Turma9.AulaGeneration;
import java.util.*;
public class CondicionaisExe3 {
	public static void main (String args[])
	{
		int idade;
		 
		
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("CATEGORIA INFANTIL ");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("CATEGORIA JUVENIL ");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("CATEGORIA ADULTO ");
		}
		else
		{
			System.out.println("FORA DOS PADR�ES ");
		}
		
		
	}
}
