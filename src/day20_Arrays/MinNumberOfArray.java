package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int [] numbers ={10,5,18,4,9};

        int min= numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
