package day09_IfStatements;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        int age = 13;
        boolean isEligible = age > 18 ;
        if (isEligible ){
            System.out.println("You can buy alcohol.");
        } else {
            System.out.println("You are not eligible to buy alcohol.");
        }


    }
}
