import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.println("-------------------- Cardápio --------------------");
	        System.out.println("Código | Produto         | Preço Unitário");
	        System.out.println("--------------------------------------------------");
	        System.out.println("1      | Cachorro Quente | R$ 10.00");
	        System.out.println("2      | X-Salada        | R$ 15.00");
	        System.out.println("3      | X-Bacon         | R$ 18.00");
	        System.out.println("4      | Bauru           | R$ 12.00");
	        System.out.println("5      | Refrigerante    | R$  8.00");
	        System.out.println("6      | Suco de Laranja | R$ 13.00");
	        System.out.println("--------------------------------------------------");
		
		System.out.println("Digite o Código do Produto: ");
		int codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = leia.nextInt();
		
		String produto = "";
		double preco = 0.0;
		double total;
		
		switch(codigo) {
			case 1:
				produto = "Cachorro Quente";
				preco = 10.00;
				break;
				
			case 2:
				produto = "X-Salada";
				preco = 15.00;
				break;
				
			case 3:
				produto = "X-Bacon";
				preco = 18.00;
				break;
				
			case 4:
				produto = "Bauru";
				preco = 12.00;
				break;
				
			case 5:
				produto = "Refrigerante";
				preco = 8.00;
				break;
				
			case 6:
				produto = "Suco de Laranja";
				preco = 13.00;
				break;
			 default:
	                
	        System.out.println("Código inválido. Por favor, digite um número de 1 a 6.");
	                leia.close();
	                return;
	                
	                }
		total = quantidade * preco;
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor Total: " + total);
	      
	        leia.close();
		}
	}

