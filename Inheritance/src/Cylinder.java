public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        height = 10.0;
    }

    public Cylinder(double radius) {
        super(radius);
        height = 7.0;
    }

    public Cylinder(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
        height = 8.0;
    }

    public Cylinder(double radius, double height, String colour) {
        this.radius = radius;
        this.height = height;
        this.colour = colour;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {

        return ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
    }

    public double getVolume() {

        return (super.getArea())*height;
    }

    @Override
    public String toString() {
        return "Cylinder's radius = " + radius + ". Colour is " + colour + ". \n" +
                "Area is " + String.format("%.2f", getArea()) + ". Volume is " + String.format("%.2f", getVolume()) + ". \n" ;
    }
}
