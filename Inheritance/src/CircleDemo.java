public class CircleDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0, "Green");
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(7.0, "Blue");
        System.out.println(circle1.toString());
        circle2.toString();
        cylinder1.toString();
        cylinder2.toString();
    }
}
