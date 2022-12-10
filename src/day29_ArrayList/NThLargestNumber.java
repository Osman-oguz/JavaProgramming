package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NThLargestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        System.out.println("list = " + list);

        int number = 5;
        for (int i = 0; i < number-1; i++) {
            list.removeIf(p -> p==Collections.max(list));
        }

        int max= Collections.max(list);

        System.out.println(max);



    }
}
/*
      Write a program that can return the nth largest number from an arraylist
      DON'T USE SORT METHOD

     arraylist= {1,2,3,4,5,6,7,7,8,8}
       n=5
       output :
         4
 */