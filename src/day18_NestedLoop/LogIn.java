package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String userName = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {

            System.out.println("Logged in.");
        } else {
            for (int i = 1; i < 4; i++) {

                System.out.println("Incorrect user name or password.");
                System.out.println("Enter your user name:");
                userName = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in.");
                    break;
                }

            }
            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked. Please contact support team.");
            }

        }


        input.close();

    }
}
