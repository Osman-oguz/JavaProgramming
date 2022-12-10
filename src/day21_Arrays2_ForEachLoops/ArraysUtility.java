package day21_Arrays2_ForEachLoops;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        System.out.println(nums); // hashcode
        System.out.println(Arrays.toString(nums));

        String str = "Java";
        System.out.println(str.toString());

        System.out.println(nums[0]);

        System.out.println("----------------------");

        int [] scores = {95,65,75,89,55};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length-1]);

        System.out.println("------------------------");

        String [] names = {"Gunay", "Anna", "Zuhal","Ahmet"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-------------------------");
        String [] str2 = {"Anna", "ANNA"};

        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));

        System.out.println("--------------------------");

        int [] arr1= {1,3,2};
        int [] arr2= {1,2,3};
        boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2= Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("--------------------------------");

        char [] ch1 = {'a','c','b'};
        char [] ch2 = {'b','a','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println(anagram);



    }

}
