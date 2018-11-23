package Practice4;

//Create three new types of exceptions. Write a class with a method that throws all three.
// In main(), call the method but only use a single catch clause that will catch all three types of exceptions.

public class MultipleException {

    public static void main (String[] args) {

        int[] array = {0, 1, 2, 3, 4};
        final int ZERO = 0;

        try {
            int a = array[6]/ZERO;


            throw new ArrayIndexOutOfBoundsException(), new ArithmeticException();
        }
        catch (Exception e) {
            System.out.println("Cause = " + e.getCause() + "\nMessage = " + e.getMessage() +
                    "\nString = " + e.toString());
        }

    }

    static class OutOfBounds extends Exception{

    }

    static class NullPointer extends Exception{

    }

    static class IllegalExp extends Exception{

    }
}
