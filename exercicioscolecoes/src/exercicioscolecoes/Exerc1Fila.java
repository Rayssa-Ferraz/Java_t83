package exercicioscolecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerc1Fila {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
		Queue<String> fila = new LinkedList<>();
        
		int opcao;

        do {
        
		 System.out.println("\n-------------------------------------------");
         System.out.println("            MENU DA FILA DE BANCO            ");
         System.out.println("-------------------------------------------");
         System.out.println("1: Adicionar Cliente na fila");
         System.out.println("2: Listar todos os Clientes");
         System.out.println("3: Retirar clientes da fila");
         System.out.println("0: Sair");
         System.out.println("-------------------------------------------");
         System.out.printf("Digite uma opção: ");
         opcao = leia.nextInt();
         leia.nextLine(); 
         
         switch (opcao) {
         case 1:
             System.out.println("Digite o nome do Cliente: ");
             var nome = leia.nextLine();
             fila.add(nome);
             System.out.println("\nFila:");
             
             for (var cliente : fila) {
                 System.out.println(cliente);
             }
             System.out.println("\nCliente Adicionado!");
             break;

         case 2:
             System.out.println("\nLista de Clientes na Fila:");
             for (var cliente : fila) {
                 System.out.println(cliente);
             }
             break;

         case 3:
             if (fila.isEmpty()) {
                 System.out.println("\nA Fila está vazia!");
             } else {
                 fila.poll(); 
                 System.out.println("\nFila:");
                 for (var cliente : fila) {
                     System.out.println(cliente);
                 }
                 System.out.println("\nO Cliente foi Chamado!");
             }
             break;

         case 0:
             System.out.println("\nPrograma Finalizado!");
             break;

         default:
             System.out.println("\nOpção Inválida! Tente novamente.");
     }

 } while (opcao != 0);

 leia.close();
}
}