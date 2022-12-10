package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {


    /*
        int num = 17;

        if (num >7 || num < 1){
            System.out.println("İnvalid");

        } else if (num==1){
            System.out.println("Monday");
        } else if (num==2) {
            System.out.println("Tuesday");

        } else if (num==3) {
            System.out.println("Wednesday");

        } else if (num==4) {
            System.out.println("Thursday");

        } else if (num==5) {
            System.out.println("Friday");

        } else if (num==6) {
            System.out.println("Saturday");

        }else {
            System.out.println("Sunday");
        }
     */
        int n = 5;
        String result = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? " Thursday"
                : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday";
        System.out.println(result);

    }
}

