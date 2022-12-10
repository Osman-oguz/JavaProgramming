package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {

        int firstNUmber = 100;
        int secondNumber = 50;

        int addition = firstNUmber + secondNumber;
        int subtraction = firstNUmber - secondNumber;
        int multiplication = firstNUmber * secondNumber;

        // 100 + 50 = 150
        System.out.println(firstNUmber + " + " + 50 + " = " + (firstNUmber+secondNumber));

        // 100 - 50 = 50

        System.out.println(firstNUmber + " - " + 50 + " = " + subtraction);

        // 100 * 50 = 5000

        System.out.println(firstNUmber + " * " + 50 + " = " + multiplication);

    }
}
