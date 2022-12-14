package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); // 121, concatenation

        System.out.println(10+20);
        System.out.println(100-50);
        System.out.println(10*5);
        System.out.println(100/3);
        System.out.println( 10.0/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b = (double) a / 6;
        System.out.println(b);



    }

}


/**
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
    %: Remainder

   integer / integer =======> integer
   decimal / integer =======> decimal
   integer / decimal =======> decimal
   decimal / decimal =======> decimal

 */