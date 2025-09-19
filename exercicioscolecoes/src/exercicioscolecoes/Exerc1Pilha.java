package exercicioscolecoes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exerc1Pilha {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	        Deque<String> pilha = new ArrayDeque<String>();
	        int opcao;

	        do {
	            System.out.println("\n-------------------------------------------");
	            System.out.println("            MENU DA PILHA DE LIVROS         ");
	            System.out.println("-------------------------------------------");
	            System.out.println("1: Adicionar um livro na pilha");
	            System.out.println("2: Listar todos os livros");
	            System.out.println("3: Retirar um livro da pilha");
	            System.out.println("0: Sair");
	            System.out.println("-------------------------------------------");
	            System.out.printf("Digite uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.println("\nDigite o nome do livro: ");
	                    var livro = leia.nextLine();
	                    pilha.push(livro);
	                    System.out.println("\nPilha: ");
	                    for (var l : pilha) {
	                    	System.out.println(l);
	                    }
	                    System.out.println("\nLivro adicionado!");
	                    break;

	                case 2:
	                    if (pilha.isEmpty()) {
	                        System.out.println("\nA Pilha está vazia!");
	                    } else {
	                       System.out.println("\nLista de livros na pilha; ");
	                       for(var l : pilha) {
	                    	   System.out.println(l);
	                       }
	                    }
	                    break;

	                case 3:
	                    if (pilha.isEmpty()) {
	                        System.out.println("\nA Pilha está vazia!");
	                    } else {
	                        pilha.pop(); 
	                        System.out.println("\nPilha:");
	                        for(var l : pilha) {
	                        	System.out.println(l);
	                        }
	                        System.out.println("\nUm livro foi retirado da pilha!");
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