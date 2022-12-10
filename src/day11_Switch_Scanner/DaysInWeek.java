package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 17;

        /*
        long number = 9L;
        float number = 9F;
        double number = 9D;
        boolean number = true;
        we can't use these data types in switch
         */

       /* if (number){
           System.out.println("Monday");
        }
        .... */
        switch (number) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Number");
                break;

        }

    }
}
