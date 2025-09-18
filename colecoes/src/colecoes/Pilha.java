package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Duna");
		pilha.push("Pai Rico, Pai Pobre");
		pilha.push("Maus");
		pilha.push("Crime e Castigo");
		pilha.push("Quarto de Despejo");
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		System.out.println("O Livro Guia do Mochileiro da galaxia está na pilha? " + pilha.contains(pilha));
		
	}

}
