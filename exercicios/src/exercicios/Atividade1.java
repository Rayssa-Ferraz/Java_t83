package exercicios;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		
		System.out.println("Digite o Salário:");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o Abono:");
		numero2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
				
        leia.close();
	}

}
