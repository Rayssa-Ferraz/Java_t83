package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros [][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
	};
		
		float numerosreais[][] = new float[3][2];
		
		System.out.println("\nListar os dados - Matriz Numeros");
		
		for(int linha = 0; linha < numeros.length; linha ++) {
			for(int coluna = 0; coluna < numeros.length; coluna ++) {
				System.out.printf("numeros[%d][%d} = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		
		System.out.println("\nInput de dados - Matriz Numeros Reais");
		
		System.out.println("Tamanho da Matriz Numeros Reais: " + numerosreais.length);

		System.out.println("Tamanho da Matriz Numeros Reais[0]: " + numerosreais[0].length);


		for(int linha = 0; linha < numerosreais.length; linha ++) {
			for(int coluna = 0; coluna < numerosreais[linha].length; coluna ++) {
				System.out.println("Digite um número: ");
				numerosreais[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println("\nListar os dados - Matriz Numeros Reais");

		for(int linha = 0; linha < numerosreais.length; linha ++) {
			for(int coluna = 0; coluna < numerosreais[linha].length; coluna ++) {
				System.out.printf("numeros[%d][%d} = %.2f%n", linha, coluna, numerosreais[linha][coluna]);
			}
				
		}
		
		leia.close();
	}
}
