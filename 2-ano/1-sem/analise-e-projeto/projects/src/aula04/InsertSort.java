package aula04;

public class InsertSort {
    public static void main(String[] args) {

        int[] vetDes = new int[]{3, 0, 1, 8, 7, 2, 5, 4, 9, 6};
        int[] vetOrd = new int[10];

        System.out.println("Vetor desordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetDes[i] + " ");
        }

        System.out.println();

        System.out.println("Vetor ordenado:");
        vetOrd = insertSort(vetDes);

        for (int i = 0; i < 10; i++) {
            System.out.print(vetOrd[i] + " ");
        }

    }

    private static int[] insertSort(int[] vetDes) {
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
        return vetDes;

    }

}
