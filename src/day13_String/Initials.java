package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();


        System.out.println((firstName.charAt(0))+". "+(lastName.charAt(0)+ "."));
        System.out.println(lastName.charAt(0));

    }
}
