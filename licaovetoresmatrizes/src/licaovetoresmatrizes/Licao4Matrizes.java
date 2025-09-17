package licaovetoresmatrizes;

import java.util.Scanner;

public class Licao4Matrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		

       
        float[][] notas = new float[10][4];
        float[] medias = new float[10]; 

       
        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.printf("Digite as 4 notas do aluno " + (aluno + 1) + ": \n");
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                notas[aluno][bimestre] = leia.nextFloat();
            }
        }

       
        for (int aluno = 0; aluno < 10; aluno ++) {
            float soma = 0.0f;
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                soma += notas[aluno][bimestre];
            }
            medias[aluno] = soma / 4.0f; 
        }

        
        System.out.println("\nMédias de cada aluno:");
        for (int aluno = 0; aluno < 10; aluno++) {
            System.out.printf("Aluno %d: %.1f\n", aluno + 1, medias[aluno]);
        }

        leia.close();
        
        
    }
}