package escada;

import java.util.Scanner;

/**Classe com algoritmo que faz a leitura de um int e imprime uma linha de caracteres "*" .
* @author Paulo Victor
* @version 1.0
*/

public class Escada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Olá, digite a altura da escada que deseja:\n");
		
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = n - i; j >= 1; j--)
			{
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++)
			{		
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
