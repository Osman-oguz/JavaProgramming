package day17_WhileAndDoWhileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter a math operator: ");
        char ch = input.next().charAt(0);

        while(!(ch == '+' || ch == '-') ){
            System.out.println("Invalid Operatori Please re-enter");
             ch = input.next().charAt(0);
        }
        System.out.println((ch == '+') ? num1 + num2 : num1-num2);

    }
}
