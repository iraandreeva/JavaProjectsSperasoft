public class MathDemo {

    public static void main(String[] args) {

        int[] array = {3, 34, 56, 112, 23, 12, 45, 1};
        MyMath math = new MyMath();

        System.out.println("Min number = " + math.minArray(array));
        System.out.println("Max number = " + math.maxArray(array));

    }
}
