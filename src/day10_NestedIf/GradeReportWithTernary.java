package day10_NestedIf;

public class GradeReportWithTernary {

    public static void main(String[] args) {


    /*
         int  s = 155;

        if (s >= 0 && s <= 100){
            if (s>=90 ){
                System.out.println("Excellent");
            } else if (s >=80 ) {
                System.out.println("Great");
            } else if (s >= 70 ) {
                System.out.println("Good");
            } else if (s >= 60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else {
            System.out.println("Invalid s.");
        }
         */

        int s = 75;
       /* String result2 = (s >= 0 && s <= 100) ? (s >= 90) ? "Exellent" : (s >= 80) ? "Great"
                : (s >= 70) ? "Good"
                : (s >= 60) ? "Passed" : "Failed" : "Invalid s.";
        System.out.println(result2); */

        System.out.println("---------------------");
        // solution2

        String result2 = "";

        if (s >= 0 && s <= 100){
            result2= (s >= 90) ? "Exellent" : (s >= 80) ? "Great"
                    : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";
            } else {
        System.out.println("Invalid score");
        }
        System.out.println(result2);

    }
}