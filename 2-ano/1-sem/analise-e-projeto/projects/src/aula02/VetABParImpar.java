package aula02;

import java.util.Scanner;

public class VetABParImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor1  = new int[10];
        int[] vetor2 = new int[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Vetor[" + (i+1) + "]: ");
            vetor1[i] = input.nextInt();

            if (vetor1[i] % 2 == 0) {
                vetor2[i] = vetor1[i] * 5;
            } else {
                vetor2[i] = vetor1[i] + 5;
            }

        }

        System.out.println("Vetor1");
        for (int i = 0; i <= 9; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println();

        System.out.println("Vetor2");
        for (int i = 0; i <= 9; i++) {
            System.out.print(vetor2[i] + " ");
        }

        System.out.println();
        System.out.println("Fim do programa");

    }
}
