package licaovetoresmatrizes;

import java.util.Scanner;

public class Licao1Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.printf("Vetor: ");
		for(int indice = 0; indice < numeros.length; indice ++) {
			System.out.printf(numeros[indice] + " ");

		}
		
				
		System.out.printf("\n\nDigite o numero que você deseja encontar: ");
		int numero = leia.nextInt();
		
		boolean encontrado = false;
		
		for(int indice= 0; indice < numeros.length; indice ++) {
			if(numeros[indice] == numero) {
				System.out.println("\nO número " + numero + " está localizado na posição: " + indice);
				encontrado = true;
				break;
			}
		}
		
		if(!encontrado) {
			System.out.println("\nO número " + numero + " não foi encontrado!");
				
			}
		
		leia.close();

	}

}
