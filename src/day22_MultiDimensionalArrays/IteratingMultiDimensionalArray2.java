package day22_MultiDimensionalArrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int [][] arr2D= { {1,2,3}, {3,4,5,6}, {7,8,9} };

        for (int i = 0; i < arr2D.length; i++) {

            // System.out.println(Arrays.toString(arr2D[i]));

            for (int i1 = arr2D[i].length-1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+" ");

            }
            System.out.println();


        }
    }
}
