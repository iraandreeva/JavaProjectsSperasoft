package Practice1;

//Write code to generate and catch an ArrayIndexOutOfBoundsException.

import java.lang.reflect.Array;

public class ArrayException {

    public static void main (String[] args) throws ArrayIndexOutOfBoundsException  {

        int[] array = {0, 1, 2, 3, 4};

        System.out.println(array[6]);

    }
}
