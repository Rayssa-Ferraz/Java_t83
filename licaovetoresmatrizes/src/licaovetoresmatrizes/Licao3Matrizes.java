package licaovetoresmatrizes;

import java.util.Scanner;

public class Licao3Matrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] numeros = new int [3][3];
		
		System.out.println("Digite 9 números inteiros: ");
		for(int linha = 0; linha <3; linha ++) {
			for(int coluna = 0; coluna < 3; coluna ++) {
				numeros[linha][coluna] = leia.nextInt();
			
			}
		}
		
		int somaP = 0;
		int somaS = 0;
		
		System.out.println("\nElementos da Diagonal Princiapal: ");
		for(int linha = 0; linha < 3; linha ++) {
			System.out.printf(numeros[linha][linha] + " ");
			somaP += numeros[linha][linha];
			
		}
		
		System.out.println("\n\nElementos da Diagonal Secundária: ");
		for(int linha = 0; linha < 3; linha ++) {
			int coluna = 2 - linha;
			System.out.printf(numeros[linha][coluna] + " ");
			somaS += numeros[linha][coluna];
			
		}
		
		System.out.printf("\n\nSoma dos Elementos da Diagonal Principal: ");
		System.out.println(somaP);
		
		System.out.printf("\n\nSoma dos Elementos da Diagonal Secundária: ");
		System.out.println(somaS);
		
		
		
		
		
		
		leia.close();


	}

}
