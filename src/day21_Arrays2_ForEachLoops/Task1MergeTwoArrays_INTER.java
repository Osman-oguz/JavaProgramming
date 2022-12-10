package day21_Arrays2_ForEachLoops;

import java.util.Arrays;

public class Task1MergeTwoArrays_INTER {
    public static void main(String[] args) {

        int [] numbers1= {10,20,30,40,50,60};
        int [] numbers2= {40,50};
        int [] newArray= new int[numbers1.length+ numbers2.length];

        for (int i = 0; i < numbers1.length; i++) {
            newArray[i]= numbers1[i];
        }
        for (int i =0; i < numbers2.length ; i++) {
            newArray [numbers1.length+i] = numbers2[i];
        }

        System.out.println(Arrays.toString(newArray));

    }
}
