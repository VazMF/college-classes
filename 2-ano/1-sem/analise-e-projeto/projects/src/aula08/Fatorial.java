package aula08;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        long num = input.nextInt();

        System.out.println("-- Método normal --");
        System.out.println(num + "! = " + factorial(num));

        System.out.println("-- Método recursivo --");
        System.out.println(num + "! = " + recursiveFactorial(num));
    }

    private static long factorial(long number) {
        long start = System.currentTimeMillis();
        long f = number;

        while (number > 1) {
            f = f * (number - 1);
            number--;
        }

        if (number == 0) {
            f = 1;
        }

        long end = System.currentTimeMillis() - start;
        System.out.println(end);
        return f;

    }

    private static long recursiveFactorial(long number) {

        if (number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);

    }
}
