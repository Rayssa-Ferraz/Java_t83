import java.util.Scanner;


public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do doador: ");
			String nome = leia.nextLine();
				
		System.out.println("Digite a idade do doador: ");
		int idade = leia.nextInt();
		
		System.out.println("É a sua primeira doação? (true/false): ");
        boolean primeiraDoacao = leia.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69) {
                if (primeiraDoacao) {
                    System.out.println("\n" + nome + " não está apto para doar sangue!");
                } else {
                    System.out.println("\n" + nome + " está apto para doar sangue!");
                }
            } else {
                System.out.println("\n" + nome + " está apto para doar sangue!");
            }
        } else {
            System.out.println("\n" + nome + " não está apto para doar sangue!");
        }

		leia.close();
	}

}