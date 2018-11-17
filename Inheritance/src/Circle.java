public class Circle {

    protected double radius;
    protected String colour;

    public Circle() {
        radius = 5.0;
        colour = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
        colour = "Green";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {

        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle radius is " + radius + ". Colour is " + colour + ". Area is " + String.format("%.2f", getArea()) + ".\n";
    }
}
