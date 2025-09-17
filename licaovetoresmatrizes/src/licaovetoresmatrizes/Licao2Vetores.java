package licaovetoresmatrizes;

import java.util.Scanner;

public class Licao2Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int[] numeros = new int[10];
		
		int soma =0;
		
		
		System.out.println("Digite 10 números inteiros: ");
		for(int indice = 0; indice < numeros.length;indice ++) {
			numeros[indice] = leia.nextInt();
		}
		
		System.out.printf("Elementos nos índices ímpares: ");
		for(int indice = 0; indice < numeros.length; indice ++) {
			if(indice %2 !=0) {
				System.out.printf(numeros[indice] + " ");
			}
		}
		
		System.out.printf("\n\nElementos nos índices pares: ");
		for(int indice = 0; indice < numeros.length; indice ++) {
			if(indice %2 ==0) {
				System.out.printf(numeros[indice] + " ");
			}
		}
		
		//int soma =0;
		for(int indice = 0; indice < numeros.length; indice ++) {
			soma += numeros[indice];
		}
		
		double media = (double) soma / numeros.length;
		
		System.out.println("\n\nSoma: " + soma);
		System.out.printf("Média: %.2f\n ", media);

		
		
		
		
		
		leia.close();

	}

}
