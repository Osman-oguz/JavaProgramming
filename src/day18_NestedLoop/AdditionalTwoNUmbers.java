package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNUmbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter first number:");
            int firstNumber = input.nextInt();

            System.out.println("Enter second number:");
            int secondNumber = input.nextInt();

            System.out.println("Addition: " + (firstNumber + secondNumber));
            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("no") || answer.equals("yes"))){
                System.err.println(" Invalid entry, please re enter.");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }

        }


    }
}
