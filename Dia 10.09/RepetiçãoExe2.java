package Turma9.AulaGeneration;

import java.util.*;

public class RepetiçãoExe2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,pares=0,impares=0,i;
		
		for(i=0;i<=10;i++) {
			System.out.println("Insira um número: ");
			num = ler.nextInt();
			
			if (num%2==0) {
				pares++;
			}
			if (num%2==1) {
				impares++;
			}
			
		}
		System.out.println("Você inseriu "+ pares + " números pares\n" + "E "+ impares + " números ímpares");
				
			 
	}
}
