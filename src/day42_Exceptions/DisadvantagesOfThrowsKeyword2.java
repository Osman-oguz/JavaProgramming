package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeyword2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        method1();
        method3();

        String str = null;
        try {
            System.out.println(str.charAt(0)); // unchecked exception
        }catch (RuntimeException e ){
            e.printStackTrace();
        }
    }

    public static void method(){
        try {
            method1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method1() throws FileNotFoundException {

       // new FileInputStream("");
    }
    public static void method3() throws FileNotFoundException, InterruptedException {

       method1();
       Thread.sleep(1000);
    }


}
