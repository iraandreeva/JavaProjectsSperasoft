package Practice1;

public class PairDemo {

    public static void main(String[] args) {

    Pair<String, Shape> objectsPair = new Pair<String, Shape>();

    objectsPair.add("Simple Shape", new Shape());

    String name = objectsPair.getFirst();

    Shape shape = objectsPair.getSecond();

    System.out.println(name + ", " + shape);

}
}