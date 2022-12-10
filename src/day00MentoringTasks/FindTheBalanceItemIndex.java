package day00MentoringTasks;

public class FindTheBalanceItemIndex {

    public static void main(String[] args) {

        int[] array = {4, 9, 1, 3, 6, 4};
        int[] array2={1,3,5,4,9};
        findAndPrintTheBalanceItemIndex(array);
        findAndPrintTheBalanceItemIndex(array2);


    }
        public static void findAndPrintTheBalanceItemIndex(int[] array){

        for (int i = 0; i < array.length; i++) {
            int sumLeft=0;
            int sumRight=0;

            for (int j = 0; j < i; j++) {
                sumLeft +=array[j];
            }
            for (int k = i+1; k < array.length ; k++) {
                sumRight +=array[k];
            }
            if (sumLeft==sumRight){
                System.out.println("The Balance Item Index: "+ i);
            }

        }

    }

}
/*
Question: **FindTheBalanceItemIndex**

   //Given an array of integers, write a program that prints the index of an item in the array, where the sum of all items on its left is equal to the sum of the ones on the right.

   For example :
       Given array => [4, 9, 1, 3, 6, 4]
   //Output:
       your program should print as a result => 2
       because the item at index 2 is 1, and 4+9 = 3+6+4
 */