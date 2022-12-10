package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even number.");
            } else {
                System.out.println(number + " is odd number.");

            }

            System.out.println("Would you like to enter another number?");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("Please re-enter, Would you like to enter another number?");
                a = input.next().toLowerCase();

            }

            if (a.equals("no")){
                break;
            }


        }



    }
}
