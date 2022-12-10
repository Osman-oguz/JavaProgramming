package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;  // 0-100
        boolean a = score >= 90 && score <= 100;
        boolean b = score>=80 && score < 90;
        boolean c = score>=70 && score < 80;
        boolean d = score>=60 && score < 70;
        boolean f = score>=0 && score < 60;

        if (a){
            System.out.println("Excellent.");
        } else if (b) {
            System.out.println("Great.");
        } else if (c) {
            System.out.println("Good.");
        } else if (d) {
            System.out.println("Passed.");
        }else {
            System.out.println("Failed.");
        }
    }
}
