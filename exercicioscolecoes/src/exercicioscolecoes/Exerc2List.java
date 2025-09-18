package exercicioscolecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc2List {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
				
		System.out.printf("\n\nDigite o número que deseja encontar: ");
		int numero = leia.nextInt();
		
				
		int posicao = numeros.indexOf(numero);
		
		
		if(posicao != -1){
			System.out.println("\n\nO número " + numero + " está localizado na posição: " + posicao);
			}else {
				System.out.println("\n\nO número " + numero + " não foi encontrado!");
				


			}
leia.close();

	}

}
