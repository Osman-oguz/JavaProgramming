package day42_Exceptions;

import day39_Recap_EncapsulationVsInheritance.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

       //  throw new NoSuchElementException("There is no such element as break"); // unchecked exception

       // throw new InterruptedException(); // this is checked exception

        // throw new Rectangle(3,5); // we can not use with other methods
    }
}
