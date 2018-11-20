
public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " + getHeight() + ", which is a" +
                "subclass of " + super.toString() + ". \n";
    }
}
