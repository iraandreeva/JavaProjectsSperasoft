package Practice1;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double width) {
        this.width = width;
        this.height = width;
    }

    public Square(double width, String colour, boolean filled) {
        this.width = width;
        this.colour = colour;
        this.filled = filled;
    }



    @Override
    public String toString() {
        return "A Square with side = " + width + ", which is a subclass of " + super.toString() + ". \n";
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        this.width = height;
        this.height = width;
    }
}
