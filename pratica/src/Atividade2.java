import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("O número " + numero + " é PAR e ");
		}else {
			System.out.printf("O número " + numero + " é IMPAR e ");
			}
		
		if(numero > 0) {
			System.out.printf("ele é POSITIVO.");
		}else if (numero < 0) {
			System.out.printf("ele é NEGATIVO.");
		
		}

		leia.close();
	}

}
