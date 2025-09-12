package exercicios;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	    
	       
	    System.out.println("Digite o Salario Bruto: ");
	    float Salario = leia.nextFloat();
	    
	    System.out.println("Digite o valor do Adicional Noturno: ");
	    float Adicional = leia.nextFloat();
	    
	    System.out.println("Digite o valor de Horas Extras: ");
	    float HoraE = leia.nextFloat();
	    
	    System.out.println("Digite o valor dos Descontos: ");
	   float Descontos = leia.nextFloat();
	    
	    float SalarioF = (Salario + Adicional + (HoraE *5) - Descontos);
	           
	    System.out.printf("\nSalário Líquido: %.2f\n", SalarioF);
	    
	    leia.close();

	}

}
