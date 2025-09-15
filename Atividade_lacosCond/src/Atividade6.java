import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.println("------------------- Reajuste de Sálario -------------------");
	        System.out.println("Código do Cargo | Cargo         | Percentual de Reajuste");
	        System.out.println("--------------------------------------------------------");
	        System.out.println(" 1              | Gerente       |        10%            ");
	        System.out.println(" 2              | Vendedor      |         7%            ");
	        System.out.println(" 3              | Supervisor    |         9%            ");
	        System.out.println(" 4              | Motorista     |         6%            ");
	        System.out.println(" 5              | Estoquista    |         5%            ");
	        System.out.println(" 6              | Técnico de TI |         8%            ");
	        System.out.println("--------------------------------------------------------");
		
		System.out.println("Digite o nome do colaborador: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		int codigo = leia.nextInt();
		
		System.out.printf("Digite o salário atual: ");
		float salario = leia.nextFloat();
		
		String cargo = "";
		double percentual = 0.0;
				
		switch(codigo) {
			case 1:
				cargo = "Gerente";
				percentual = 0.10;
				break;
				
			case 2:
				cargo = "Vendedor";
				percentual = 0.07;
				break;
				
			case 3:
				cargo = "Supervisor";
				percentual = 0.09;
				break;
				
			case 4:
				cargo = "Motorista";
				percentual = 0.06;
				break;
				
			case 5:
				cargo = "Estoquista";
				percentual = 0.05;
				break;
				
			case 6:
				cargo = "Técnico de TI";
				percentual = 0.08;
				break;
			default:
				System.out.println("Código do cargo invalido!");
				leia.close();
				return;
		}
				double novoSalario = salario + (salario * percentual);
				
				System.out.println("                                              ");
				System.out.println("----------------------------------------------");
				System.out.println("Nome do colaborador: " + nome);
				System.out.println("Cargo: " + cargo);
				System.out.printf("Salário: R$ %.2f\n ", novoSalario);

				  leia.close();
						}
					}
