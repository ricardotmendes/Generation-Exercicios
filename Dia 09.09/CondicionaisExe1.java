package Turma9.AulaGeneration;
import java.util.*;

public class CondicionaisExe1 {
	public static void main(String args[])
	{
		float n1,n2,n3;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Informe o primeiro n�mero: ");
			n1 = ler.nextFloat();
			System.out.println("Informe o segundo n�mero: ");
			n2 = ler.nextFloat();
			System.out.println("Informe o terceiro n�mero: ");
			n3 = ler.nextFloat();
			
			if (n1>n2 && n1>n3)
			{
				System.out.println("O primeiro n�mero � o maior");
			}
			else if (n2>n1 && n2>n3)
			{
				System.out.println("O segundo n�mero � o maior");
			}
			else if (n3>n1 && n3>n2)
			{
				System.out.println("O terceiro n�mero � o maior");
			}
			
	}
}
