package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = (short) a;

        int c = b;  // implicit casting

        long d = 123456789;
        int e = (int) d ; // explicit casting

        long j = 1000_000;
        short k = (short) j;
        System.out.println(j + " : " + k);

        double m = 2.5;
        float n = (float)m;
        System.out.println(m + " : " + n);

        double p = 10.5;
        int r = (int) p;

        System.out.println(p + " : " + r);

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : " + s1);

        float f1 = 30.5f;
        long l1 = (long) f1;
        System.out.println(f1 + " : " + l1);






    }
}
