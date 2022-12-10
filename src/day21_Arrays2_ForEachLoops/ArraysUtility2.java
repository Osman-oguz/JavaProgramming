package day21_Arrays2_ForEachLoops;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay", "Cihad","David","James","Aeron", "Daniel"};
        String [] earlyBirds= Arrays.copyOf(students,15);
        System.out.println(Arrays.toString(earlyBirds));


        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------");

        char[] ch1= {'A','B','C','D','E','F','G','H','I'};

        char[] ch2= Arrays.copyOfRange(ch1,2,5);

        System.out.println(Arrays.toString(ch2));

        System.out.println("-------------------------");

        int [] scores = {10,20,30,40,50,60,70,80,90,100};

        int [] result2 = Arrays.copyOfRange(scores,5,scores.length);

        System.out.println(Arrays.toString(result2));
    }
}
