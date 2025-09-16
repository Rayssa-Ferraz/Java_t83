package atividade;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------------- Reajuste Salárial --------------------");
        System.out.println("Código do Cargo  | Cargo         | Percentual de Reajuste  ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("        1        | Gerente       |          10%            ");
        System.out.println("        2        | Vendedor      |           7%            ");
        System.out.println("        3        | Supervisor    |           9%            ");
        System.out.println("        4        | Motorista     |           6%            ");
        System.out.println("        5        | Estoquista    |           5%            ");
        System.out.println("        6        | Técnico de TI |           8%            ");
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Nome do colaborador: ");
        String nome = leia.nextLine();
        
        System.out.println("Digite código do cargo: ");
        int codigo = leia.nextInt();
        
        System.out.printf("Digite o salário atual: ");
        double salario = leia.nextDouble();
        
        String cargo = "";
        double reajuste = 0.0;
        
        switch (codigo) {
        case 1:
        	cargo = "Gerente";
        	reajuste =0.10;
        	break;
        	
        case 2:
        	cargo = "Vendedor";
        	reajuste =0.07;
        	break;
        	
        case 3:
        	cargo = "Supervisor";
        	reajuste =0.09;
        	break;
        	
        case 4:
        	cargo = "Motorista";
        	reajuste =0.06;
        	break;
        	
        case 5:
        	cargo = "Estoquista";
        	reajuste =0.05;
        	break;
        	
        case 6:
        	cargo = "Técnico de TI";
        	reajuste =0.08;
        	break;
        	default:
        		System.out.println("Código Inválido!");
        		leia.close();
        		return;
        }
		
        double novoSalario = salario + (salario * reajuste);
        
        System.out.println("-------------------------------------");
        System.out.println("Colaborador:" + nome);
        System.out.println("Cargo:" + cargo);
        System.out.printf("Salário: R$ %.2f",novoSalario);
        
        leia.close();


	}

}
