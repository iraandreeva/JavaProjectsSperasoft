public class Circle2 extends Shape {
    private double radius;

    public Circle2() {
        radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String colour, boolean filled) {
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;

}

    public String toString() {
        return "A Circle with radius = " + getRadius() + " , which is a subclass of " + super.toString() + ".\n";
    }
}
