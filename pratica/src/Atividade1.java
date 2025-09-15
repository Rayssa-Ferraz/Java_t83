import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int c = leia.nextInt();
		
		int soma = a+b;
		
		if(soma > c) {
			System.out.println("A soma de A + B é MAIOR que C.");
			
		}else if(soma < c) {
			System.out.println("A soma de A + B é MENOR qur C.");
			
		}else {
			System.out.println("A soma de A + B é IGUAL a C.");
		}
		
		
		
		leia.close();
		
		

	}

}
