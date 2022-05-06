package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double height;
    private double radius;
    public final static double pi = 3.14;

    public Cylinder(String name, double height, double radius) {
        super(name);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return (2*pi*radius)*(radius+height);
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }
}
