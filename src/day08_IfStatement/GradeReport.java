package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        /*System.out.println(true == !false);
        System.out.println(!true != false);
        System.out.println(!false == true);

        System.out.println(!!false);
        System.out.println(!!!true);
        */

        int score = 65;  // 0-100
        boolean a = score >= 90 && score <= 100;

        boolean b = score>=80 && score < 90;
        boolean c = score>=70 && score < 80;
        boolean d = score>=60 && score < 70;
        boolean f = score>=0 && score < 60;




        if (a) {
            System.out.println("Excellent.");
        }
        if (b) {
            System.out.println("Great.");
        }
        if (c) {
            System.out.println("Good.");
        }
        if (d) {
            System.out.println("Passed.");
        }
        if (f) {
            System.out.println("Failed.");
        }


    }
}
