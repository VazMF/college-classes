package exercicios.ex01;

import java.util.Scanner;

/**
 * Faça um programa em Java com um método recursivo para calcular a somatória de todos os número de 1 a N
 * (N será lido pelo teclado).
 * Exemplo: Se N é igual a 5, a somatória dos números será igual a 15, ou seja, 1+2+3+4+5=15.
 */

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Result: " + recursiveSum(num));

    }

    private static int recursiveSum(int num) {

        if (num == 0) {
            return 0;
        } else {
            return recursiveSum(num - 1) + num;
        }
    }
}
