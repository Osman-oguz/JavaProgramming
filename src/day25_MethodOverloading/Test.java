package day25_MethodOverloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming";

        StringUtility.printEachChar(str);

        System.out.println(StringUtility.reverse(str));
        System.out.println("-----------------");

        String word = "civic";
        System.out.println(StringUtility.isPalindrome(word));

        System.out.println("---------------------");

        String [] names={"Anna","Java","Python","Mom","Cydeo"};
        int count =0;
        for (String each:names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-----------------");

        String s2= "aaaaaaaacccbbbbbbb";
        System.out.println(StringUtility.removeDuplicates(s2));


    }
}
