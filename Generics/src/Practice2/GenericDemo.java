package Practice2;

public class GenericDemo {

    public static void main(String[] args) {

    GenericDemo demo = new GenericDemo();
    Pair<String> name1 = new Pair<String>();
    name1.add("Mama");
    Pair<String> name2 = new Pair<String>();
    name2.add("Mama");
    System.out.println("Is equal " + name1.getT() + " with " + name2.getT() + ": " + Pair.compare(name1, name2));
}}

