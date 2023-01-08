package day45_Abstraction.shape;

public class Sphere extends Shape implements Volume {

    private double radius;
    public  final static  double PI = 3.14;

    public Sphere( double radius) {
        super("Sphere");
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
        return 4 * PI * radius * radius ;
    }

    @Override
    public double volume() {
        return 4 * PI * radius * radius * radius /3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                super.toString() +
                '}';
    }
}
