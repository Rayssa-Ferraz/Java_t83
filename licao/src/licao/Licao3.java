package licao;

import java.util.Scanner;

public class Licao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int menor21 = 0;
		int maior50 = 0;
		
		System.out.println("Digite uma idade: ");
		int idade = leia.nextInt();
		
		while(idade >= 0) {
			if(idade < 21) {
				menor21 ++;
			}else if(idade > 50) {
				maior50 ++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("*************************************************");
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maior50);

		
		
		
		
		
		leia.close();

	}

}
