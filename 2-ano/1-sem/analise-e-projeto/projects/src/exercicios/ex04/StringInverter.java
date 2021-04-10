package exercicios.ex04;

import java.util.Scanner;

/**
 * Construa um programa em Java para inverter uma string utilizando a recursividade.
 */

public class StringInverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String palavra = input.nextLine();

        System.out.println(inverter(palavra));
    }

    private static String inverter(String palavra) {
        if (palavra.equals("")) {
            return "";
        } else {
            int last = (palavra.length() - 1);

            return palavra.charAt(last) + inverter(palavra.substring(0, last));
        }
    }

}
