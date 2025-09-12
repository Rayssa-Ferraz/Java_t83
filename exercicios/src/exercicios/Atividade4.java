package exercicios;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	    
	       
	    System.out.println("Digite o número 1: ");
	    float numero1 = leia.nextFloat();
	    
	    System.out.println("Digite o número 2: ");
	    float numero2 = leia.nextFloat();
	    
	    System.out.println("Digite o número 3: ");
	    float numero3 = leia.nextFloat();
	    
	    System.out.println("Digite o número 4: ");
	    float numero4 = leia.nextFloat();
	    
	    float Difere = ((numero1 * numero2) - (numero3 * numero4));
	           
	    System.out.printf("Diferença: %.1f\n", Difere);
	    	    
	    
	    System.out.println("\nDigite o número 5: ");
	    float numero5 = leia.nextFloat();
	    
	    System.out.println("Digite o número 6: ");
	    float numero6 = leia.nextFloat();
	    
	    System.out.println("Digite o número 7: ");
	    float numero7 = leia.nextFloat();
	    
	    System.out.println("Digite o número 8: ");
	   float numero8 = leia.nextFloat();
	    
	    float Diferen = ((numero5 * numero6) - (numero7 * numero8));
	           
	    System.out.printf("Diferença: %.1f\n", Diferen);
	    
	    leia.close();
	}

}
