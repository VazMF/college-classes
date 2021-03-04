package aula03;

import java.util.Scanner;

public class MatrizInvertida {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        int op = 0;

        String resp = "S";

        while (resp.equals("S")) {
            System.out.println();
            System.out.println("** Menu de Opções **");
            System.out.println("1. Inserir elementos no Vetor A");
            System.out.println("2. Listar Vetor A");
            System.out.println("3. Inserir elementos no Vetor B");
            System.out.println("4. Listar Vetor B");
            System.out.println("5. Pesquisar um elemento no Vetor A");
            System.out.println("6. Pesquisar um elemento no Vetor B");
            System.out.println("7. Pesquisar elemento nos dois vetores (A e B)");
            System.out.println("8. Sair");
            System.out.print("Sua opção: ");
            op = input.nextInt();
            System.out.println();

            if (op == 1) {
                insereVetA(vetorA);
            } else if (op == 2) {
                System.out.println();
                System.out.println("VetorA: ");
                listarVetorA(vetorA);
            } else if (op == 3) {
                insereVetB(vetorB);
            } else if (op == 4) {
                System.out.println();
                System.out.println("VetorB: ");
                listarVetorB(vetorB);
            } else if (op == 5) {
                pesquisarVetA(vetorA);
            } else if (op == 6) {
                pesquisarVetB(vetorB);
            } else if (op == 7) {
                pesquisarVetores(vetorA, vetorB);
            } else if (op == 8) {
                System.exit(0);
            } else {
                System.out.println("Opção Inválida!");
            }

            System.out.println();
            System.out.print("Deseja continuar (S/N)? ");
            resp = input.next().toUpperCase();

        }

    }

    private static void insereVetA(int[] vetorA) {

        for (int i = 0; i <= 9; i++) {
            System.out.print("Vet[" + (i + 1) + "]: ");
            vetorA[i] = input.nextInt();
        }
    }

    private static void listarVetorA(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void insereVetB(int[] vetorB) {

        for (int i = 0; i <= 9; i++) {
            System.out.print("Vet[" + (i + 1) + "]: ");
            vetorB[i] = input.nextInt();
        }
    }

    private static void listarVetorB(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void pesquisarVetA(int[] vetor) {

        System.out.print("Informe o valor a ser pesquisado: ");
        int aux = input.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (aux == vetor[i]) {
                System.out.println("O valor " + vetor[i] + " foi encontrado no indice " + (i + 1));
            }
        }
    }

    private static void pesquisarVetB(int[] vetor) {

        System.out.print("Informe o valor a ser pesquisado: ");
        int aux = input.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (aux == vetor[i]) {
                System.out.println("O valor " + vetor[i] + " foi encontrado no indice " + (i + 1));
            }
        }
    }

    private static void pesquisarVetores(int[] vetorA, int[] vetorB) {
        System.out.print("Informe o valor a ser pesquisado: ");
        int aux = input.nextInt();
        for (int i = 0; i < vetorA.length; i++) {
            if (aux == vetorA[i]) {
                System.out.println("O valor " + vetorA[i] + " foi encontrado no indice " + (i + 1) + " do vetor A");
            } else if (aux == vetorB[i]) {
                System.out.println("O valor " + vetorB[i] + " foi encontrado no indice " + (i + 1) + " do vetor B");
            }
        }
    }
}