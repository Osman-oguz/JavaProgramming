package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char [] alphabets = new char[26];  // Z~A

        alphabets[0] = 'Z';
        alphabets[1] = 'Y';

        System.out.println(Arrays.toString(alphabets));
        System.out.println(alphabets[0]);

        /*
        char ch = 'Z';
        for (int j=0;  j< alphabets.length ; ch--,j++) {

            alphabets[j]=ch;
        }
        System.out.println(Arrays.toString(alphabets));
         */

        for (char i = 0,j = 'Z'; i < alphabets.length ; i++,j--) {
            alphabets[i]=j;

        }
        System.out.println(Arrays.toString(alphabets));






    }
}
