package Practice1;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape() {
        colour = "green";
        filled = true;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with the colour of " + colour + " and " + filled + ".\n";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean isInside(double x, double y);


}
