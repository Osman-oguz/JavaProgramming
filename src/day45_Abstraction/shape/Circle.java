package day45_Abstraction.shape;

public class Circle extends Shape implements Perimeter {

    private double radius;
    public  final static  double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0 ){
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius =" + radius +
                ", perimeter =" + perimeter() +
                '}';
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
