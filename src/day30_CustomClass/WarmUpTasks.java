package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        // task1. Swap the first and last elements of an Arraylist

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

     //   int [] arr = {1,2,3,4,5,6};
     //   System.out.println(Arrays.toString(arr));

        // Task2. write a program that can move all the zeros to the last indexes of Arraylist

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,0,3,0,50,0,70,80,0,10));

        System.out.println(list);

        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize= list.size();
        int totalNUmberOfZeros= size-newSize;
        System.out.println("totalNUmberOfZeros = " + totalNUmberOfZeros);

        for (int i = 0; i < totalNUmberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("---------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(10,0,3,0,50,0,70,80,0,10));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each!=0){
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each==0){
                result.add(0);
            }
        }
        System.out.println(result);
        /* Task3. wr,te a program that can extract the special characters, digits and letter from a string and stores them into a separate Arraylist

        Ex: "ABCD123$%#@&456EFG!";

        output: list1={1,2,3,4,5,6}
                list2= {A,B,C,D,E,F,G}
                list3={$,%,#,@,&,!}
         */
        String str= "ABCD123$%#@&456EFG!";

       ArrayList<Character> chars= new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);

        ArrayList<Character> letters= new ArrayList<>(chars); // add all the chars
        letters.removeIf(p -> !Character.isLetter(p));  // remove the characters that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits= new ArrayList<>(chars); // add all the chars
       digits.removeIf(p -> !Character.isDigit(p));  // remove the characters that are not digits
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChars= new ArrayList<>(chars); // add all the chars
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        System.out.println("specialChars = " + specialChars);






    }
}
