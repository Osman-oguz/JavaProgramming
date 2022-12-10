package day21_Arrays2_ForEachLoops;

import java.util.Arrays;

public class Task1Merge2 {

    public static void main(String[] args) {

        //Muhtar's solution

        String [] group1 = {"Ayşe","Fatma","Hayriye"};
        String [] group2 = {"Ali","Veli","Deli"};

        String [] newGroup= new String[group1.length+ group2.length];

        int i = 0;
        for (String each : group1) {
            newGroup[i++]= each;
        }
        for (String each : group2) {
            newGroup[i++]= each;
        }
        System.out.println(Arrays.toString(newGroup));

        System.out.println("-----------------------");
        char [] ch1= {'A','B','C'};
        char [] ch2= {'D','E','F'};

        char [] chars = new char[ch1.length+ ch2.length];
        int j=0;

        for (char ch: ch1) {
            chars[j]=ch;
            j++;
        }
        for (char ch: ch2) {
            chars[j]=ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));

    }

}
