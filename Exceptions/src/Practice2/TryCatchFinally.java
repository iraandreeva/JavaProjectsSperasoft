package Practice2;

//Create a class with a main() that throws an object of class Exception inside a try block.
// Give the constructor for Exception a String argument.
// Catch the exception inside a catch clause and print the String argument.
// Add a finally clause and print a message to prove you were there.

public class TryCatchFinally {

    public static void main(String[] args) {


        try {
            throw new Exception("Now we have trying to do smf");
        }
        catch (Exception e) {
            System.out.println("Next messages will be print, if there are an exception:");
            System.out.println("Cause of exception: " + e.getCause() + "\nString: " + e.toString());
        }
        finally {
            System.out.println("\nI tried to do my first try/catch/finally.");
        }
    }
}
