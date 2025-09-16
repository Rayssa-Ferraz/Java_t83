package licao;

import java.util.Scanner;

public class Licao6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int soma =0;
		int contador = 0;
		int numero;
		
		do {
			System.out.printf("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero !=0 && numero %3 == 0) {
				soma += numero;
				contador++;
			}
		}while (numero !=0);
		
			if(contador > 0) {
				double media = (double) soma / contador;
				System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
			
			}
		
			
		
		leia.close();

	}

}
