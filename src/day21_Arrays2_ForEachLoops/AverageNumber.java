package day21_Arrays2_ForEachLoops;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};
        double sum = 0;

      /*  for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        double averageNumber = sum / numbers.length;


       */

        for (int number : numbers) {
            sum += number;

        }
        double averageNumber = sum / numbers.length;

        System.out.println("averageNumber = " + averageNumber);
    }
}
