package day10_NestedIf;

public class Task_3_Grade {

    /**
     Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
     'A': excellent
     'B': great job
     'C': good
     'D': passed
     'F': failed
     other wise: invalid

     NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */

    public static void main(String[] args) {

        char ch, grade = 'X';
        String text = "Invalid";

        if (grade=='A' || grade == 66 || grade == 67 || grade == 68 || grade == 70){
            if(grade == 65){
                text = "excellent";
            } else if (grade == 66) {
                text = "great job";
            } else if (grade == 67) {
                text = "good";
            } else if (grade == 68) {
                text = "passed";
            }else {
                text = "failed";
            }

        }else {
             text = "Invalid";
        }
        System.out.println(text);
    }
}
