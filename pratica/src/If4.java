<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 21c638edda5e581c241a413d29a1d87ac914994d

public class If4 {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		Scanner leia = new Scanner(System.in);

               
        System.out.print("Primeira característica (Vertebrado/Invertebrado): ");
        String caracteristica1 = leia.nextLine();

        System.out.print("Segunda característica (Ave/Mamifero/Inseto): ");
        String caracteristica2 = leia.nextLine();

        System.out.print("Terceira característica (Carnivoro/Onivoro/Herbivoro): ");
        String caracteristica3 = leia.nextLine();

        String animal = "Animal não encontrado.";

        
        if (caracteristica1.equalsIgnoreCase("vertebrado")) {
            if (caracteristica2.equalsIgnoreCase("mamifero")) {
                if (caracteristica3.equalsIgnoreCase("onivoro")) {
                    animal = "Homem";
                } else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
                    animal = "Vaca";
                }
            } else if (caracteristica2.equalsIgnoreCase("ave")) {
                if (caracteristica3.equalsIgnoreCase("carnivoro")) {
                    animal = "Águia";
                } else if (caracteristica3.equalsIgnoreCase("onivoro")) {
                    animal = "Pombo";
                }
            }
        } else if (caracteristica1.equalsIgnoreCase("invertebrado")) {
            if (caracteristica2.equalsIgnoreCase("inseto")) {
                if (caracteristica3.equalsIgnoreCase("herbivoro")) {
                    animal = "Lagarta";
                } else if (caracteristica3.equalsIgnoreCase("onivoro")) {
                    animal = "Formiga";
                }
            } else if (caracteristica2.equalsIgnoreCase("anelideo")) {
                if (caracteristica3.equalsIgnoreCase("onivoro")) {
                    animal = "Minhoca";
                } else if (caracteristica3.equalsIgnoreCase("hematofago")) {
                    animal = "Sanguessuga";
                }
            }
        }

       
        System.out.println("\nO animal selecionado é: " + animal);
        
        leia.close();
    }
}
=======
		// TODO Auto-generated method stub

	}

}
>>>>>>> 21c638edda5e581c241a413d29a1d87ac914994d
