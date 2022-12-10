package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int num= -200;

        if (num > 0){
            System.out.println("Positive");

        } else if (num<0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }

    }
}
