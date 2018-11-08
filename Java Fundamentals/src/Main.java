import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*First commit
        //System.out.println("Min of 2 integers= " + min2(15, 23));
        //System.out.println("Min of 3 integers= " + min3(15, 23, 2));
        //System.out.println("Min of 4 integers= " + min4(15, 23, 2, 1));
        */

        //Second commit
        Scanner a = new Scanner(System.in);
        int numA = a.nextInt();
        Scanner b = new Scanner(System.in);
        int numB = b.nextInt();
        Scanner c = new Scanner(System.in);
        int numC = c.nextInt();
        Scanner d = new Scanner(System.in);
        int numD = d.nextInt();
        System.out.println("Min of 2 integers= " + min2(numA, numB));
        System.out.println("Min of 3 integers= " + min3(numA, numB, numC));
        System.out.println("Min of 4 integers= " + min4(numA, numB, numC, numD));

    }
    public static int min2 (int a, int b)
    {
        int min;
        if (a < b)
            min = a;
        else
            min = b;
        return min;
    }

    public static int min3 (int a, int b, int c)
    {
        int min;
        if (c <= (min2(a, b)))
            min = c;
        else
            min = min2(a, b);
        return min;
    }

    public static int min4 (int a, int b, int c, int d)
    {
        int min;
        if (d < min3(a, b, c))
            min = d;
        else
            min = min3(a, b, c);
        return min;
    }
}
