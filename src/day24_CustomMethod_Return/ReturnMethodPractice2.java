package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        // create a function that can calculate the grade

        /*
        check the grade
        'A' ====> Excellent
        'B' ====> Great
        ...
         */
       String str= grade(69);
        if (str.equals("A")){
            System.out.println("Excelent");
        } else if (str.equals("B")) {
            System.out.println("Great");
        } else if (str.equals("C")) {
            System.out.println("Good");
        } else if (str.equals("D")) {
            System.out.println("Passed");
        }else {
            System.out.println("Try again!");
        }

    }
    public static String grade(int score){

        String result="";

        if (score<0 || score > 100){
            result= "Invalid";
        }else {

            result = (score>=90) ? "A":(score>=80) ? "B": (score>=70) ? "C": (score>=60) ? "D":"F";
        }
        return result;
    }

}
