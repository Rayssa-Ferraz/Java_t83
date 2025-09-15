import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
		
		
				System.out.println("Código da Operação    | Operação         ");
		        System.out.println("-----------------------------------------");
		        System.out.println("       1              |    Saldo         ");
		        System.out.println("       2              |    Saque         ");
		        System.out.println("       3              |    Depósito      ");
				
        float saldo = 1000.0f;
        System.out.println("Digite o código da operação (1=Saldo, 2=Saque, 3=Depósito): ");
        int operacao = leia.nextInt();

        switch (operacao) {
            case 1: 
                System.out.println("Operação - Saldo");
                System.out.printf("Saldo: R$ %.2f%n", saldo);
                break;

            case 2: 
                System.out.print("Digite o valor do saque: R$ ");
                float valorSaque = leia.nextFloat();
                System.out.println("Operação - Saque");
                if (valorSaque > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.printf("Novo Saldo: R$ %.2f%n", saldo);
                }
                break;

            case 3: 
                System.out.print("Digite o valor do depósito: R$ ");
                float valorDeposito = leia.nextFloat();
                saldo += valorDeposito;
                System.out.println("Operação - Depósito");
                System.out.printf("Novo Saldo: R$ %.2f%n", saldo);
                break;

            default: 
                System.out.println("Operação Inválida!");
        
        }

        leia.close();
    }
}