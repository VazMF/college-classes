package aula04;

public class InsertSort {
    public static void main(String[] args) {

        int[] vetDes = new int[]{3, 0, 1, 8, 7, 2, 5, 4, 9, 6};

        System.out.println("Vetor desordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetDes[i] + " ");
        }

        System.out.println();

        insertSort(vetDes);
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetDes[i] + " ");
        }

    }

    private static void insertSort(int[] vetDes) {
        for (int i = 0; i < vetDes.length; i++) {

            int aux = vetDes[i];
            int j = i - 1;

            while (j>=0 && aux < vetDes[j]) {
                vetDes[j+1] = vetDes[j];
                j--;
            }

            vetDes[j+1] = aux;
        }
    }

}
