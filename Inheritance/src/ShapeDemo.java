public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle2(5);
        shapes[1] = new Circle2(7, "Red", false);
        shapes[2] = new Rectangle(3, 7);
        shapes[3] = new Rectangle(5, 10, "Blue", true);
        shapes[4] = new Square();
        shapes[5] = new Square(3);

        shapes[0].toString();
        System.out.println("Circle's area is = " + String.format("%.2f", ((Circle2)shapes[0]).getArea()));
        shapes[1].toString();
        System.out.println("Circle's area is = " + String.format("%.2f", ((Circle2)shapes[1]).getArea()));
        shapes[2].toString();
        System.out.println("Rectangle's perimeter is = " + ((Rectangle)shapes[2]).getPerimeter());
        shapes[3].toString();
        System.out.println("Rectangle's perimeter is = " + ((Rectangle)shapes[3]).getPerimeter());
        shapes[4].toString();
        System.out.println("Square's perimeter is = " + ((Square)shapes[4]).getPerimeter());
        shapes[5].toString();
        System.out.println("Square's perimeter is = " + ((Square)shapes[5]).getPerimeter());
    }
}
