package day17_WhileAndDoWhileLoop;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

/*
        System.out.println("Enter your username: ");
        String username = input.nextLine();

        System.out.println("Enter your password: ");
        String password = input.nextLine();


        if(username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("You logged in.");
        }else {
            int countFalse= 3;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && countFalse > 0  ){

                if(countFalse == 1){
                    System.err.println("This is your last chance!");
                }
                System.err.println("Invalid username or password!");
                countFalse--;
                System.out.println("Enter your username: ");
                username = input.nextLine();

                System.out.println("Enter your password: ");
                password = input.nextLine();


            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("You logged in.");

            }else {
                System.err.println("Your account is blocked!");
            }

        }
        input.close();
*/

        for (int i = 1; i < 4 ; i++) {
            System.out.println("Enter your username: ");
            String username = input.nextLine();

            System.out.println("Enter your password: ");
            String password = input.nextLine();

            if(username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("You logged in.");
                break;
            }
            if (i == 2 ){
                System.err.println("This is your last chance!");
            }
            if (i == 3){
                System.err.println("Your account is blocked.");
            }
        }


    }
}
