package day20_Arrays;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        int [] numbers = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]= input.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
