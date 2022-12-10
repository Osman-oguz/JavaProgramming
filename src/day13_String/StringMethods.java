package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar= word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);

      //  char tenthChar = word.charAt(9);  this is out of range


        System.out.println(word.length());

        char lastChar = word.charAt(word.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------");

        String str = "wooden spoon";
        String str1 = str.toUpperCase();
        System.out.println("str1 = " + str1);

        String sentence = "Today is a great day to learn java programming.";
        String sentence2= sentence.toUpperCase();
        System.out.println("sentence2 = " + sentence2);

    }
}
