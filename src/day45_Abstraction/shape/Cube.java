package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{
    public Cube(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }


    @Override
    public String toString() {
        return "Cube{}";
    }

    @Override
    public double volume() {
        return 0;
    }
}
