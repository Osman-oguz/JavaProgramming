package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radious of the circle:");
        double r = input.nextDouble();

        double area = r * r * 3.14;
        double perimeter = 2 * 3.14 * r ;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        input.close();
    }
}
