import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

  
        System.out.print("Digite o 1º número: ");
        float numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = leia.nextFloat();

        System.out.println("\n--- Operações ---");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o código da operação (1 a 4): ");
        int operacao = leia.nextInt();

        float resultado = 0.0f;
        String simbolo = "";
        boolean operacaoValida = true;


        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                simbolo = "+";
                break;
            case 2:
                resultado = numero1 - numero2;
                simbolo = "-";
                break;
            case 3:
                resultado = numero1 * numero2;
                simbolo = "*";
                break;
            case 4:
               
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    simbolo = "/";
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
             
                System.out.println("Operação Inválida!");
                operacaoValida = false;
                break;
        }

 
        if (operacaoValida) {
            System.out.printf("\n%.1f %s %.1f = %.1f\n", numero1, simbolo, numero2, resultado);
        }

        leia.close();
    }
}