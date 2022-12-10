package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        int number = 23;

        if (number >= 1 && number <= 18) {
            switch (number) {

                case 6:
                case 7:
                case 8:
                    System.out.println("Middle School");
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("High School");
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    System.out.println("Collage");
                    break;
                case 17:
                case 18:
                    System.out.println("Grad School");
                default:
                    System.out.println("Elementary School");
                    break;

            }
        } else {
            System.err.println("Invalid Grade Level");
        }


    }
}
