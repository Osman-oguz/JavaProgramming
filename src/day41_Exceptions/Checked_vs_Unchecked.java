package day41_Exceptions;

import day39_Recap_EncapsulationVsInheritance.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        // Unchecked exception
        int a = 10;
        int b = 0;

       // System.out.println( a / b);          --------> arithmetic exception

       // System.out.println("Wooden Spoon");    ------> Process finished with exit code 1
                                  // it means that after line 11 this line wil NOT executed


        char[] characters = {'A','B','C'};

       // System.out.println(characters[99]);     ------> indexOutOfBoundException

         Student student = null;
       // System.out.println(student.getName());  ------> NullPointerException
       // student.study();                        ------> NullPointerException

        final String str = "Wooden Spoon";

         // str = null;
       // System.out.println(str.toUpperCase());   ------> NullPointerException

        String str2 = "";   // object and != null

    //==================================================================================
        // Checked Exception:

        System.out.println("Hello");

        // Thread.sleep(3000);   ------> InterruptedException

        System.out.println("Cydeo");

       //  FileInputStream file = new FileInputStream("path of the file");  ------> fileNotFoundException











    }
}
