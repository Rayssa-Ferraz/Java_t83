package licao;

import java.util.Scanner;

public class Licao2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o " + contador + "° número: ");
			int num = leia.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
					
		}
		System.out.println("-------------------------------------");
		System.out.println("\nTotal de número pares: " + par);
		System.out.println("\nTotal de número impares: " + impar);
		
		leia.close();


	}

}
