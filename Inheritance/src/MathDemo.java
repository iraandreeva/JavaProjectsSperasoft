public class MathDemo {

    public static void main(String[] args) {

        int[] array = {3, 34, 56, 112, 23, 12, 45, 1};
        double[] array1 = {3.2, 56.4, 78.1, 1.2, 89.9, 456.78, 23.4};
        MyMath math = new MyMath();

        System.out.println("Min number = " + math.minArray(array));
        System.out.println("Min number = " + math.minArray(array1));
        System.out.println("Max number = " + math.maxArray(array));
        System.out.println("Max number = " + math.maxArray(array1));
        System.out.println("Next max after = " + math.nextAfter(array, 42));
        System.out.println("Next max after = " + math.nextAfter(array1, 76.5));
        System.out.println("Pow = " + math.pow(2,-2));
        System.out.println("Pow = " + Math.pow(2,-2));
        System.out.println("Pow = " + String.format("%.2f", math.pow(2.5,10)));

    }
}
