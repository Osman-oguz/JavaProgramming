package day18_NestedLoop;

public class DivideTwoPositiveNumbers {
    public static void main(String[] args) {

         int a = 100;
         int b = 8;
         int count =0;
         while (a>=b){
             a -= b;
             count ++;
         }
        System.out.println("count = " + count + " with a remainder " + a);

    }
}
