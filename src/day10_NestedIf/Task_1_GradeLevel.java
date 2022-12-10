package day10_NestedIf;

public class Task_1_GradeLevel {

    public static void main(String[] args) {
        /*
        Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

        byte gradeNumber = 7;
        String school = "";

        if (gradeNumber >= 1 && gradeNumber <= 18){
            if (gradeNumber <= 5 ){
                school = "Elementary school";
            } else if (gradeNumber <= 8) {
                school = "Middle school";
            }else if (gradeNumber <= 12) {
                school = "High school";
            }else if (gradeNumber <= 16) {
                school = "College";
            }else  {
                school = "Grad School";
            }

        }else {
            school = "Invalid grade level given";
        }
        System.out.println(school);
    }
}
