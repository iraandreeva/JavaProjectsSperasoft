public class Circle {

    protected double radius;
    protected String color;

    public Circle() {
        radius = 5.0;
        color = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle radius is " + getRadius() + ". Color is " + getColour() + ". Area is" + getArea() + ".\n";
    }
}
