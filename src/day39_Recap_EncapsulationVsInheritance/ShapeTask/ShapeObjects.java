package day39_Recap_EncapsulationVsInheritance.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println(square);

        square.setSide(20);
        System.out.println(square);
        System.out.println("-------------------------");

        Rectangle rectangle = new Rectangle(15,20);
        System.out.println(rectangle);

        System.out.println(rectangle.getName());

        System.out.println("-------------------------");

        Circle circle = new Circle(12);
        System.out.println(circle);
    }
}
