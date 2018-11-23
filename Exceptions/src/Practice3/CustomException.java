package Practice3;

//Create your own exception class using the extends keyword.
// Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
// Write a method that prints out the stored String.
// Create a try-catch clause to exercise your new exception.

public class CustomException {

    public static void main (String[] args) {

        int[] array = {0, 1, 2, 3, 4};

        try {
            System.out.println(array[6]);
            System.out.println("\nNow we have trying to do smf");
            throw new MyException("My", " ");
        }
        catch (MyException e) {
            //System.out.println("Next messages will be print, if there are an exception:");
            e.printExp();
        }
        finally {
            System.out.println("\nI tried to do my first try/catch/finally.");
        }

    }


    static class MyException extends Exception {

        private String my = "My exception";

        public String getMy() {
            return my;
        }


        public MyException(String exp, String my) {
            super(exp);
            this.my = my;
        }



        public String printExp () {

            return "MyException()";
        }

    }

}


