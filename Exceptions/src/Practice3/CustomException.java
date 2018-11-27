package Practice3;

//Create your own exception class using the extends keyword.
// Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
// Write a method that prints out the stored String.
// Create a try-catch clause to exercise your new exception.

public class CustomException {

    public static void main (String[] args) {


        try {
            System.out.println("Now we have trying to do smf\n");
            throw new MyException("My exception");
        }
        catch (MyException e) {
            System.out.println("Next messages will be print, if there are an exception:");
            e.printExp();
        }
        finally {
            System.out.println("\nI tried to do my first try/catch/finally.");
        }

    }


    static class MyException extends Exception {

        private String message = "My exception";

        public String getMessage() {
            return message;
        }


        public MyException(String exp) {
            this.message = exp;
        }



        public void printExp () {
            System.out.println(message);
        }

    }

}


