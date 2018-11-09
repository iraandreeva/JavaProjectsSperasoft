import java.util.Scanner;

public class JavaFundamentalPractice5 {


    public static void main (String[] args)
    {
        int n;

        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        hanoy(n, 1, 3, 2);
         }


         public static void hanoy(int n, int from, int to, int add)
         {
             String A = "A", B = "B", C = "C";
             if (n == 0)
                 return;
             hanoy(n-1, from, add, to);
             if (from == 1 && to == 2)
                 System.out.println("Disk num = " + n + ". From " + A + " to " + B);
             if (from == 1 && to == 3)
                 System.out.println("Disk num = " + n + ". From " + A + " to " + C);
             if (from == 2 && to == 1)
                 System.out.println("Disk num = " + n + ". From " + B + " to " + A);
             if (from == 2 && to == 3)
                 System.out.println("Disk num = " + n + ". From " + B + " to " + C);
             if (from == 3 && to == 1)
                 System.out.println("Disk num = " + n + ". From " + C + " to " + A);
             if (from == 3 && to == 2)
                 System.out.println("Disk num = " + n + ". From " + C + " to " + B);
             hanoy(n-1, add, to, from);

         }
}
