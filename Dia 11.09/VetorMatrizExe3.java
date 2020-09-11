package Turma9.AulaGeneration;
import java.util.*;

public class VetorMatrizExe3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		System.out.println("Matriz [3][3]\n") ;
		int [] [] matriz = new int [3][3];
		
		int linha,coluna,maior10=0;
		
			for(linha =0; linha<3 ; linha++) {
				for(coluna = 0; coluna<3; coluna++) {
					System.out.printf("Insira o número [%d][%d]: ",linha+1,coluna+1);
					matriz[linha][coluna] = ler.nextInt();
					if (matriz[linha][coluna] > 10) {
						maior10++;
					}
				
				}
				
				
	}
			System.out.println("O total de números digitados acima de 10 é de " + maior10);
			
			}
}
