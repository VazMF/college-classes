package exercicios.ex03;

import java.util.Scanner;

/**
 * Construa um método em Java que calcule o máximo divisor comum entre dois números utilizando a recursividade
 */

public class Mdc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = input.nextInt();

        System.out.print("Digite um número: ");
        int num2 = input.nextInt();

        System.out.println("O máximo divisor comum é " + mdc(num1, num2));;
    }

    private static int mdc(int number1, int number2) {
        if (number1 % number2 == 0) {
            return number2;
        } else {
            return mdc(number2, (number1 % number2));
        }

    }
}
