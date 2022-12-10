package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "  ";
        boolean r = str.isEmpty();

        System.out.println("r = " + r);

        boolean s = str.isBlank();
        System.out.println("s = " + s);

        String str2 = "Cydeo   ";

        System.out.println(str2.isBlank());

        // blank and repeat methods added with jdk 11

        System.out.println("-----------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-----------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println("------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains(input2));

        System.out.println(input1.toLowerCase().contains("java")); // TRUE
        System.out.println(input1.toUpperCase().contains("JAVA")); // TRUE


    }
}
