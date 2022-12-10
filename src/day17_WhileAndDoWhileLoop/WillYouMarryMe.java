package day17_WhileAndDoWhileLoop;

import java.util.Scanner;

public class WillYouMarryMe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = input.next();

        while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no") )){
            System.err.println("Invalid answer, please re-enter");
            System.out.println("Will you marry me?");
            answer =input.next();
        }
        if ((answer.equalsIgnoreCase("yes"))){
            System.out.println("Congrats.");
        }else {
            System.out.println("Goodbye.");
        }
    }
}
