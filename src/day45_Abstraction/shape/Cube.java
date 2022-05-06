package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 4*3*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                ", side=" + side +
                '}';
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
