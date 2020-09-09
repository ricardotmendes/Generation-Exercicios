package Turma9.AulaGeneration;
import java.util.*;

public class CondicionaisExe1 {
	public static void main(String args[])
	{
		float n1,n2,n3;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Informe o primeiro número: ");
			n1 = ler.nextFloat();
			System.out.println("Informe o segundo número: ");
			n2 = ler.nextFloat();
			System.out.println("Informe o terceiro número: ");
			n3 = ler.nextFloat();
			
			if (n1>n2 && n1>n3)
			{
				System.out.println("O primeiro número é o maior");
			}
			else if (n2>n1 && n2>n3)
			{
				System.out.println("O segundo número é o maior");
			}
			else if (n3>n1 && n3>n2)
			{
				System.out.println("O terceiro número é o maior");
			}
			
	}
}
