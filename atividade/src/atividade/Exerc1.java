package atividade;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite o valor de a: ");
		int a = leia.nextInt();
		
		System.out.printf("Digite o valor de b: ");
		int b = leia.nextInt();
		
		System.out.printf("Digite o valor de c: ");
		int c = leia.nextInt();
		
		int soma = a + b;
		
		if(soma >c) {
			System.out.println("A soma de a + b e MAIOR que c.");
		}else if(soma < c) {
			System.out.println("A soma de a + b é MENOR que c.");
		}else {
			System.out.println("A soma de a + b é IGUAl a c.");
		}
		
	leia.close();
	
	}

}
