package day14_String;

public class StringMethods4 {
    public StringMethods4() {
    }

    public static void main(String[] args) {
        String str = "Cydeo";
        str = str.repeat(4);
        System.out.println("str = " + str);
        String s1 = "Wooden Spoon ";
        s1 = s1.repeat(100);
        System.out.println("s1 = " + s1);
        System.out.println("------------");
        System.out.println("Fady\n".repeat(15));
        System.out.println("-----------------------");
        String name = "Java";
        System.out.println((name + " ").repeat(5));
    }
}