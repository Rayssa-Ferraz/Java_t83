package atividade;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira caractrerística (Vertebrado/Invertebrado): ");
		String caracte1 = leia.nextLine();
		
		System.out.println("Digite a segunda caractrerística (Ave/Mamífero/Inseto/Anelídeo): ");
		String caracte2 = leia.nextLine();
		
		System.out.println("Digite a terceira caractrerística (Carnívoro/Onívoro/Herbívoro/Hematófago): ");
		String caracte3 = leia.nextLine();
		
		String animal = "Animal não encontrado";
		
		if(caracte1.equalsIgnoreCase("vertebrado")) {
			if(caracte2.equalsIgnoreCase("mamifero")) {
				if(caracte3.equalsIgnoreCase("onivoro")) {
					animal = "Homem";
				}else if (caracte3.equalsIgnoreCase("herbivoro")) {
					animal = "Vaca";
				}
			}else if (caracte2.equalsIgnoreCase("ave")) {
				if(caracte3.equalsIgnoreCase("carnivoro")) {
					animal = "Águia";
				}else if(caracte3.equalsIgnoreCase("onivoro")) {
					animal = "Pomba";
				}
			}else if(caracte1.equalsIgnoreCase("invertebrado")) {
					  if(caracte2.equalsIgnoreCase("inseto")) {
						if(caracte3.equalsIgnoreCase("hematofago")) {
							animal = "Pulga";
					}else if(caracte2.equalsIgnoreCase("herbivoro")) {
						animal = "Lagarta";
					}
				}else if(caracte2.equalsIgnoreCase("anelideo")) {
					if(caracte3.equalsIgnoreCase("hematofago")) {
						animal = "Sanguessuga";
						}else if(caracte3.equalsIgnoreCase("onivoro")) {
							animal = "Minhoca";
			}
		}
	}
			System.out.println("\nO animal selecionado é: " + animal);
	        
	        leia.close();
	    }
	}
}