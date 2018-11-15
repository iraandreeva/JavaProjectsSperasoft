public class Cylinder extends Circle{
    double height;

    public Cylinder(){
        height = 10;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
       return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    public String toString() {
        return "Cylinders radius = " + getRadius() + ". Color is " + getColour() + ". \n" +
                " Area is " + getArea() + ". Volume is " + getVolume() + ". \n" ;
    }
}
