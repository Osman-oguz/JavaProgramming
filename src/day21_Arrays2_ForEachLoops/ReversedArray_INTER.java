package day21_Arrays2_ForEachLoops;

import java.util.Arrays;

public class ReversedArray_INTER {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};

        // {50,40,30,20,10}

        int [] reversed = new int[numbers.length];

        for (int i = numbers.length-1; i >=0 ; i--) {

               reversed [numbers.length-1-i] =numbers [i];

        }
        System.out.println(Arrays.toString(reversed));
    }
}
