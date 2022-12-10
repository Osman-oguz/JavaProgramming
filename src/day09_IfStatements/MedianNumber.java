package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int num1 = 1, num2 = 17, num3 = 30;
/*
        boolean possibility1 = num1 < num2 && num2 < num3;
        boolean possibility2 = num2 < num1 && num1 < num3;
        boolean possibility3 = num1 < num3 && num3 < num2;
        boolean possibility4 = num2 < num3 && num3 < num1;
        boolean possibility5 = num3 < num1 && num1 < num2;
        boolean possibility6 = num3 < num2 && num2 < num1;
*/
        boolean possibility1 = (num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1);
        boolean possibility2 = (num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2);
        boolean possibility3 = !possibility1 && !possibility2;


        if (possibility1 ) {
            System.out.println(num2 + " is the median number.");
        }
        if (possibility2 ) {
            System.out.println(num1 + " is the median number.");
        }
        if (possibility3 ) {
            System.out.println(num3 + " is the median number.");
        }



    }
}
