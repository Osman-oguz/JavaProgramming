package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[][]  array2D = { {1,2,3}, {4,5,6}};

       String reverse ="";

        for (int i = array2D.length - 1; i >= 0; i--) {
            for (int i1 = array2D[i].length - 1; i1 >= 0; i1--) {
                reverse += array2D[i][i1]+" " ;


            }
        }

        System.out.println(reverse);



    }
}
/*

1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */