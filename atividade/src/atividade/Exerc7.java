package atividade;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código da Operação | Operação         ");
        System.out.println("--------------------------------------");
        System.out.println("        1          |   Soma           ");
        System.out.println("        2          |   Subtração      ");
        System.out.println("        3          |   Multiplicação  ");
        System.out.println("        4          |   Divisão        ");
        System.out.println("--------------------------------------");
        
        System.out.printf("Digite o 1º número:");
        float numero1 = leia.nextFloat();
        
        System.out.printf("Digite o 2º número:");
        float numero2 = leia.nextFloat();
        
        System.out.println("Digite o código da operação: ");
        int codigo = leia.nextInt();
        
        float resultado;
        boolean valido = true;
        
       switch (codigo) {
       case 1:
    	   resultado = numero1 + numero2;
    	   System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    	   break;
    	   
       case 2:
    	   resultado = numero1 - numero2;
    	   System.out.println(numero1 + " - " + numero2 + " = " + resultado);
    	   break;
    	   
       case 3:
    	   resultado = numero1 * numero2;
    	   System.out.println(numero1 + " * " + numero2 + " = " + resultado);
    	   break;
    	   
       case 4:
    	   if(numero2 != 0) {
    		   resultado = numero1 / numero2;
    		   System.out.println(numero1 + " / " + numero2 + " = " + resultado); 
    	   }else {
    		   System.out.println("Erro: Divisão por zero!");
    	   }
    	  
    	   break;
    	   default:
    		   System.out.println("Operção Inválida!");
    		   valido = false;
    	   
       }
 leia.close();
	}

}
