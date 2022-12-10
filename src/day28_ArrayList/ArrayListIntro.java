package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Osman");
        names.addAll(Arrays.asList("Ali","Ayşe","Fatma"));

        names.set(1,"John");

        System.out.println(numbers);
        System.out.println(names);
        System.out.println(names.set(1,"John"));

        names.remove("Fatma");


    }
}
