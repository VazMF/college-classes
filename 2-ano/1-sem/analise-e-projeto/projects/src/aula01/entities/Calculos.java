package aula01.entities;

public class Calculos {

    public double grossSalary(double hour, double value) {
        return hour * value;
    }

    public double discount(double grossSalary) {
        return grossSalary * 0.09;
    }

    public double liquidSalary(double grossSalary, double discount) {
        return grossSalary - discount;
    }
}
