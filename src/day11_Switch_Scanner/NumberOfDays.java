package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int year = 2022;
        int number = 2;

        if (number >= 1 && number <= 12) {

            switch (number) {

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                    break;
                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 Days");
                    } else {
                        System.out.println("28 Days");
                    }
                    break;
                default:
                    System.out.println("31 Days");
                    break;
            }

        } else {
            System.out.println("Invalid");
        }

    }
}
