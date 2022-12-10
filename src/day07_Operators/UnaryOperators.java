package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println( num1 < 0);
        System.out.println(num2 < 0);

        System.out.println("-------------------------------------");

       int b = 100;

        System.out.println(++b); // pre increment: increases the value by 1 immediately

        int c = 100;

        System.out.println(c++);  // c is still 100 on this line (post increment)
        System.out.println(c);  // 101

        int z = 45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int q = 38;
        System.out.println(--q);  // 37
        System.out.println(q--);  // 37
        System.out.println(q);   // 36
    }
}
