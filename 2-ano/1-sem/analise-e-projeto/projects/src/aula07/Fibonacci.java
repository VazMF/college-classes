package aula07;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        //long[] vet = new long[5];

        long start = System.currentTimeMillis();
        for (int i = 0; i < 65; i++) {
            //vet[i] = fibonacci(i);
            System.out.print(fibonacci(i) + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time");

        System.out.println("Minutes:");
        long minutes = ((end - start) / 60000);
        System.out.println(minutes);

        System.out.println("Hours: ");
        long hours = minutes / 60;
        System.out.println(hours);

        //System.out.println("vector: " + Arrays.toString(vet));

    }

    public static long fibonacci(int n) {

        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}
