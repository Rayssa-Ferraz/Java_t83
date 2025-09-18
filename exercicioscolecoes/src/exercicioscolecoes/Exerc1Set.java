package exercicioscolecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc1Set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 Set<Integer> numeros = new HashSet<Integer>();
		 
		for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o " + (i + 1) + "º número: ");
            int numero = leia.nextInt();

            numeros.add(numero);
        }

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
        leia.close();
    }
}