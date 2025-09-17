package licao;

import java.util.Scanner;

public class Licao4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int backend = 0, mulherFE = 0, homemMo = 0, nbFull = 0, totalp = 0;
		
		long somaIdades = 0;
		
		double mediaIdades = 0;
		
		char continua = 'S';
		
		while(continua == 'S' || continua == 's') {
			System.out.printf("Idade: ");
			int idade = leia.nextInt();
			
			
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trnas");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			System.out.printf("Gênero: ");
			int genero = leia.nextInt();
			
			
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			System.out.printf("Pessoa Desenvolvedora: ");
			int pdev = leia.nextInt();
			
			if(pdev == 1) {
				backend++;
			}
			
			if(pdev == 2 && (genero == 1 || genero == 4)) {
				mulherFE++;
			}
			
			if(pdev == 3 && idade > 40 && (genero == 2 || genero == 5)) {
				homemMo++;
			}
			
			if(pdev == 4 && idade <30 && genero == 3) {
				nbFull++;
			}
			
			totalp++;
			
			somaIdades += idade;
			
			System.out.println("Deseja cadastrar outro colaborador? (S/N): ");
			continua = leia.next().charAt(0);
		}
		
			System.out.println("\n--------Resultados da Pesquisa--------");
			System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
			System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFE);
			System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMo);
			System.out.println("Total de Não Binários desenvolvedores FullStack menores de 30 anos: " + nbFull );
			System.out.println("O número total de pessoas que reponderam à pesquisa: " + totalp);
			
			if(totalp > 0) {
				mediaIdades = Math.round(somaIdades / totalp);
				System.out.printf("Média de idade das pessoas que respoderam: %.2f\n", mediaIdades);

			}

				
		leia.close();

	}

}
