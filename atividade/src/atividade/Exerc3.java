package atividade;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		String nome = leia.nextLine();
		
		System.out.printf("Digite a idade do doador: ");
		int idade = leia.nextInt();
		
		System.out.println("É a primeira doação? (true ou false): ");
		boolean primeirad = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && idade <= 69) {
				if(primeirad) {
					System.out.println("\n" + nome + " não está apto para doar sangue.");
                } else {
                    System.out.println("\n" + nome + " está apto para doar sangue!");
                }
            } else { // Idade entre 18 e 59
                System.out.println("\n" + nome + " está apto para doar sangue!");
            }
        } else { // Idade fora do intervalo 18-69
            System.out.println("\n" + nome + ", não está apto para doar sangue.");
        }

        leia.close();
    }
}
