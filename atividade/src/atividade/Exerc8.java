package atividade;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código da Operação | Operação         ");
        System.out.println("--------------------------------------");
        System.out.println("        1          |   Saldo          ");
        System.out.println("        2          |   Saque          ");
        System.out.println("        3          |   Depósito       ");
        System.out.println("--------------------------------------");
        
        float saldo = 1000.0f;
        System.out.println("Digite o código da operação: ");
        int operacao = leia.nextInt();
        
        switch(operacao) {
        case 1:
        	System.out.println("Saldo: R$ ");
        	System.out.printf("Saldo: R$ %.2f", saldo);
        	break;
        	
        case 2:
        	System.out.println("Digite o valor que deseja sacar: R$ ");
        	float valorsaque = leia.nextFloat();
        	System.out.printf("Saque");
        	if(valorsaque > saldo) {
        		System.out.println("Saldo Insuficiente!");
        	}else {
        		saldo -= valorsaque;
        		System.out.printf("Novo Saldo: R$ %.2f", saldo);   		
        		        		
        	}
        	break;
        case 3:
        	System.out.println("Digite o valor que deseja depositar: R$ ");
        	float valordeposito = leia.nextFloat();
        	saldo += valordeposito;
        	System.out.printf("Depósito");
        	System.out.printf("Novo Saldo: R$ %.2f", saldo);
        	break;
        	
        default:
        	System.out.println("Opração Inválida!");
        }
leia.close();
	}

}
