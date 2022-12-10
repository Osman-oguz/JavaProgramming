package day21_Arrays2_ForEachLoops;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers ={10,5,18,4,9};

        int max= numbers[0];

    /*    for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]> max){
                max = numbers[i];
            }
        }

     */

        for (int number : numbers) {
            if (number> max){
                max = number;
            }
        }
        System.out.println(max);


    }
}
