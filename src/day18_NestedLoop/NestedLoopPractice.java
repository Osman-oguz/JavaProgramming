package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your age:");
            int age = input.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.out.println("Invalid entry, please re-enter your age");
                age = input.nextInt();
            }
            System.out.println("would you like to continue?");
            String answer = input.next().toLowerCase();


            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid entry, please re-enter. would you like to continue?");
                answer = input.next().toLowerCase();

            }

            if (answer.equals("no")){
                break;
            }

        }
        input.close();
    }
}
