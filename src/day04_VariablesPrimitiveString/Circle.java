package day04_VariablesPrimitiveString;

public class Circle {

    public static void main(String[] args) {

        double radius = 5.3;
        double perimeter = 2 * Math.PI * radius ;
        double area = Math.PI * radius * radius ;

        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + String.format("%.2f", perimeter));
        System.out.println("area = " + String.format("%.2f",area));
    }
}
