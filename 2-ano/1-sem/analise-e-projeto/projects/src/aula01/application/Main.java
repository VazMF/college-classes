package aula01.application;

import aula01.entities.Calculos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculos calculos = new Calculos();
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas: ");
        double hour = input.nextDouble();
        System.out.print("Informe o valor da hora: ");
        double value = input.nextDouble();

        double salarioBruto = calculos.grossSalary(hour, value);
        System.out.println("Salario bruto: " + salarioBruto);

        double desconto = calculos.discount(salarioBruto);
        System.out.println("Desconto: " + desconto);

        double salarioLiquido = calculos.liquidSalary(salarioBruto, desconto);
        System.out.println("Salario liquido: " + salarioLiquido);

    }
}
