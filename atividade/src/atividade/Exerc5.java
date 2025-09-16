package atividade;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------------- Cardápio --------------------");
        System.out.println("Código    | Produto         | Preço Unitário      ");
        System.out.println("--------------------------------------------------");
        System.out.println("   1      | Cachorro Quente | R$ 10.00            ");
        System.out.println("   2      | X-Salada        | R$ 15.00            ");
        System.out.println("   3      | X-Bacon         | R$ 18.00            ");
        System.out.println("   4      | Bauru           | R$ 12.00            ");
        System.out.println("   5      | Refrigerante    | R$ 8.00             ");
        System.out.println("   6      | Suco de Laranja | R$ 13.00            ");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Digite o código do produto: ");
        int codigo = leia.nextInt();
        
        System.out.println("Digite a quantidade: ");
        int quantidade = leia.nextInt();
        
        double Preco = 0.0;
        String Produto = "";
        
        switch (codigo){
        case 1:
        	Produto = "Cachorro Quente";
        	Preco = 10.00;
        	break;
        	
        case 2:
        	Produto = "X-Salada";
        	Preco = 10.00;
        	break;
        	
        case 3:
        	Produto = "X-Bacon";
        	Preco = 18.00;
        	break;
        	
        case 4:
        	Produto = "Bauru";
        	Preco = 12.00;
        	break;
        	
        case 5:
        	Produto = "Refrigerante";
        	Preco = 8.00;
        	break;
        	
        case 6:
        	Produto = "Suco de Laranja";
        	Preco = 13.00;
        	break;
        	default:
        		System.out.println("Código Inválido!");
        		leia.close();
        }
       double Total = quantidade * Preco;
        
        System.out.println("Produto:" + Produto);
        System.out.println("Quantidade:" + quantidade);
        System.out.println("Total:" + Total);
        
        leia.close();
        
	}

}
