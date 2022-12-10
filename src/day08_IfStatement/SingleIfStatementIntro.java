package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;

        boolean evenNumber = number % 2 == 0;


        if (evenNumber) {
            System.out.println(number + " is an even number.");
        }
        if (!evenNumber) {
            System.out.println(number + " is an odd number.");

        }
    }


}
