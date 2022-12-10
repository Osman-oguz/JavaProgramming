package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";

        int age = 19;
        String citizen = "USA";

        boolean isEligibleToVote = (age>=18 && citizen == "USA");
        System.out.println(name + " is eligible to vote: " + isEligibleToVote );
        System.out.println("------------------------------------------------------");

        String name2 = "Hosh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40_000;


        boolean isEligible2 =creditScore >= 700 && age2 >= 21 && income >= 60_000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("--------------------------------------------------------");


        String name3 = "Shay";
        char gender = 'F';
        int age3 = 21;

        boolean isEligible3 = age3 >=18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible to register " + isEligible3);


        System.out.println("------------------------------------------------------");


        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        System.out.println("----------------------------------------------------");

        String name5 = "Anna";
        double gpa = 3.5;
        int familyIncome = 100_000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60_000;

        System.out.println(name5 + " is eligible for scholarship: " + isEligible5);


        System.out.println("----------------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------------------------------");

        int score = 85;

        boolean passed = score >= 60;

        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
