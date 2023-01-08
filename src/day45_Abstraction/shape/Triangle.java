package day45_Abstraction.shape;

public class Triangle extends Shape implements Perimeter {

    private double side1, side2, side3;

    public Triangle( double side1, double side2, double side3) {
        super("Triangle");
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 <= 0){
            throw new RuntimeException("Invalid side: " + side1);
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 <= 0){
            throw new RuntimeException("Invalid side: " + side2);
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 <= 0){
            throw new RuntimeException("Invalid side: " + side3);
        }
        this.side3 = side3;
    }

    @Override
    public double area() {
        double u = (side1 + side2 + side3) /2;
        return Math.sqrt(u * (u-side1) * (u-side2) * (u-side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
