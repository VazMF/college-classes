package aula06;

import java.util.Arrays;
import java.util.Scanner;

public class Ordena {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vector = new int[10];

        int[] v = {5,2,7,9,6,8,10,1};
        int[] w = new int[v.length];


        System.out.println();
        int option = 0;

        while (option != 5) {
            System.out.println("=-+-= Menu de opções =-+-=");
            System.out.println("[ 1 ] Insertion Sort");
            System.out.println("[ 2 ] Bubble Sort");
            System.out.println("[ 3 ] Merge Sort");
            System.out.println("[ 4 ] Listar vetor ordenado");
            System.out.println("[ 5 ] Sair");
            System.out.print("Escolha um método de ordenação: ");
            option = input.nextInt();

            System.out.println();

            if (option == 1) {
                System.out.println("INSERTION SORT");
                System.out.println("Informe os números para o vetor:");
                for (int i = 0; i < vector.length; i++) {
                    System.out.print("vet[" + (i+1) + "] = ");
                    vector[i] = input.nextInt();
                }
                insertionSort(vector);
                System.out.println();
            } else if (option == 2) {
                System.out.println("BUBBLE SORT");
                System.out.println("Informe os números para o vetor:");
                for (int i = 0; i < vector.length; i++) {
                    System.out.print("vet[" + (i+1) + "] = ");
                    vector[i] = input.nextInt();
                }
                bubbleSort(vector);
                System.out.println();
            } else if (option == 3) {
                System.out.println("MERGE SORT");
                mergeSort(v, w, 0, v.length - 1);
                System.out.println(Arrays.toString(v));
                System.out.println();
            } else if (option == 4) {
                System.out.print("Vetor ordenado: ");
                listarVetorOrdenado(vector);
                System.out.println();
            } else {
                System.out.println("Opção inválida!");
            }

        }
    }



    private static int[] insertionSort(int[] vetDes) {
        int trocas = 0;
        int comparacoes = 0;
        for (int i = 0; i < vetDes.length; i++) {
            comparacoes++;

            int aux = vetDes[i];
            int j = i - 1;

            while (j>=0 && aux < vetDes[j]) {
                trocas++;
                vetDes[j+1] = vetDes[j];
                j--;
            }

            vetDes[j+1] = aux;
        }
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        return vetDes;

    }

    private static int[] bubbleSort(int[] vetor) {
        int tamanho = vetor.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = tamanho - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                comparacoes++;
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocas++;
                }
            }
        }
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        return vetor;
    }

    private static void mergeSort(int[] v, int[] w, int ini, int fim) {

        if (ini < fim) {

            int meio = (ini + fim) / 2;
            mergeSort(v, w, ini, meio);
            mergeSort(v, w, meio + 1, fim);
            intercalar(v, w, ini, meio, fim);

        }
    }

    private static void intercalar(int[] v, int[] w, int ini, int meio, int fim) {

        for(int k = ini; k <= fim; k++)
            w[k] = v[k];

        int i = ini;
        int j = meio + 1;

        for(int k = ini; k <= fim; k++){

            if(i > meio){
                v[k] = w[j++];
            }
            else
            if(j > fim){
                v[k] = w[i++];
            }
            else
            if(w[i] < w[j])
                v[k] = w[i++];
            else
                v[k] = w[j++];

        }
    }

    public static void listarVetorOrdenado(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();
    }
}


