package Practice1;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(5);
        shapes[1] = new Circle(7, "Red", false);
        shapes[2] = new Rectangle(3, 7);
        shapes[3] = new Rectangle(5, 10, "Blue", true);
        shapes[4] = new Square();
        shapes[5] = new Square(3);

        for (int i = 0; i < shapes.length; i++) {
                System.out.print(shapes[i]);
                System.out.println("Area = " + String.format("%.2f", shapes[i].getArea()) );
                System.out.println("Perimeter = " + String.format("%.2f", shapes[i].getPerimeter()) + "\n");
        }

    }
}
