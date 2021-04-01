package exercicios.ex02;

import java.util.Scanner;

/**
 * Faça um programa em Java com um método recursivo que conte os dígitos de um determinado número.
 * OBS: se o usuário inserir o número 222, a saída deve ser o número digitado tem 3 dígitos.
 */

public class DigitCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("O número digitado tem " + counter(number) + " dígitos");
    }

    public static int cont;
    private static int counter(int num) {

        if (num != 0) {
            cont++;
            counter(num / 10);
        }
        return cont;

    }
}
