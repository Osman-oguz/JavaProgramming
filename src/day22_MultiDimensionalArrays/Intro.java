package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {
        String[] group1= {"John", "James","Joes"};
        String[] group2= {"Ali", "Veli","Joes"};
        String[] group3= {"John", "James","Joes"};

        String [][] groups = new String[3][]; // index 0,1,2
        groups[0]= group1;
        groups[1]= group2;
        groups[2]= group3;

        // System.out.println(Arrays.toString(groups)); // toString method is for one dimensional
        System.out.println(Arrays.deepToString(groups));

        System.out.println("----------------------------------");

        /*
        {1,2,3}
        {3,4,5,6}
        {7,8,9}
         */
        int [][] arr2D= { {1,2,3}, {3,4,5,6}, {7,8,9} };

        System.out.println(arr2D[0][0]);
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));


    }
}
/*
String[] group1= {" John", "James","Joes"}
String[] group2= {" John", "James","Joes"}
String[] group3= {" John", "James","Joes"}

 */