package aula05;

public class BubbleSort {
    public static void main(String[] args) {

        int[] vetor = new int[]{3, 0, 1, 8, 7, 2, 5, 4, 9, 6};

       System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        bubbleSort(vetor);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

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
        return vetor;
    }
}
