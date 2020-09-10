package Turma9.AulaGeneration;
import java.util.*;
public class RepetiçãoExe6 {
	public static void main(String args[])
	{
		int num,soma=0,quant=0,media=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Insira um número: ");
			num = ler.nextInt();
			
			if (num==0)
			{
				media=soma/quant;
				System.out.println("A média dos números múltiplos de 3 é: "+ media);
			}
			if(num%3==0);
			{
				soma=soma+num;
				quant++;
			
			}
			
			
		}
		while(num!=0);
	}
}
