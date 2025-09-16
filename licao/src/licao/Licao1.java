package licao;

import java.util.Scanner;

public class Licao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número do intervalo: ");
		int num1 = leia.nextInt();
		
		System.out.println("Digite o 2º número do intervalo: ");
		int num2 = leia.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Intervalo Inválido!");
			
			leia.close();
			return;
		}

		System.out.println("\nNo Intervalo entre " + num1 + " e " + num2 + ":\n ");
		for(int intervalo = num1; intervalo <= num2; intervalo++) {
			if(intervalo % 3 == 0 && intervalo % 5 == 0) {
				System.out.println(intervalo + " é múltiplo de 3 e 5");
				
			}
		}
	leia.close();
	}

}
