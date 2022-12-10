package day09_IfStatements;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {


          int fistNumber, secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        fistNumber = input.nextInt();

        System.out.println("Enter second number:");
        secondNumber = input.nextInt();


        boolean situotion1 = fistNumber < secondNumber;
        boolean situotion2 = fistNumber > secondNumber;
        boolean situotion3 = fistNumber == secondNumber;

        if (situotion1){
            System.out.println(fistNumber + " is the min number. " );
        }
        if (situotion2){
            System.out.println(secondNumber + "  is the min number. " );
        }
        if (situotion3){
            System.out.println( "  Given numbers equal");
        }
    }
}
