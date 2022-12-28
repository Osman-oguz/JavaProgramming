package day42_Exceptions;

import java.nio.file.FileAlreadyExistsException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("-----------Test1------------");

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("Cydeo");
        System.out.println("----------Test1 Completed---------");

        System.out.println("-----------Test2------------");

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("EU10");
        System.out.println("----------Test2 Completed---------");



    }
}
// 57 min  Disadvantages of Throws