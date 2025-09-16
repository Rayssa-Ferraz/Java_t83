package atividade;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		int numero = leia.nextInt();
		
		if(numero %2 == 0) {
			System.out.printf("O número " + numero + " é PAR e ");
		}else {
			System.out.printf("O número " + numero + " é ÍMPAR e ");
		}
		
		if(numero >0) {
			System.out.printf(" positivo.");
		}else if(numero < 0) {
			System.out.printf(" negativo");
		}

		leia.close();
	}

}
