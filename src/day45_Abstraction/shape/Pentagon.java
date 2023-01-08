package day45_Abstraction.shape;

public class Pentagon extends Shape implements Perimeter{

    private double side;

    public Pentagon( double side) {
        super("Pentagon");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side * Math.sqrt(3)/4;
    }


    @Override
    public double perimeter() {
        return 6 * side ;
    }
}
