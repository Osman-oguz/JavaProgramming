package day21_Arrays2_ForEachLoops;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1= "acdb";
        String str2= "dbca";
        // write a program that can check if str1 & str2 are build out same characters

       char[] ch1= str1.toCharArray();
       char[] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2))  {
            System.out.println("The same characters");
        }else{
            System.out.println("Not the same characters");
        }


    }
}
