package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {
        int[]arr = {1,2,3,3,4,5,3,5,6,6,7};
        arr = replaceAll(arr,3,10);
        System.out.println(Arrays.toString(arr));

    }
    // replaces all the matching old elements with the new element
    public static int[] replaceAll(int[] array,int oldElement,int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }  
    public static double[] replaceAll(double[] array,double oldElement,double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }  
    public static char[] replaceAll(char[] array,char oldElement,char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i]=newElement;
            }
        }
        return array;
    } 
    public static String[] replaceAll(String[] array,String oldElement,String newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement) ){
                array[i]=newElement;
            }
        }
        return array;
    }

}
