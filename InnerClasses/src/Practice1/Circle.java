package Practice1;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;

    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + " , which is a subclass of " + super.toString();
    }

    @Override
    public double getPerimeter() {
        int two = 2;
        return two*radius*Math.PI;
    }


}
