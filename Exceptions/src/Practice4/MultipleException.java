package Practice4;

//Create three new types of exceptions. Write a class with a method that throws all three.
// In main(), call the method but only use a single catch clause that will catch all three types of exceptions.

public class MultipleException {

    public static void main (String[] args) {

        int i = 2;

        try {
            switch (i) {
                case 0:
                    throw new OutOfBounds("First exp");
                case 1:
                    throw new NullPointer("Second exp");
                case 2:
                    throw new IllegalExp("Third exp");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static class OutOfBounds extends Exception{
        private String message;

        public OutOfBounds(String exp) {
            this.message = exp;
        }

        @Override
        public String getMessage() {
            return message;
        }

    }

    static class NullPointer extends Exception{
        private String message;

        public NullPointer(String exp) {
            this.message = exp;
        }

        public void printExp () {
            System.out.println(message);
        }

        @Override
        public String getMessage() {
            return message;
        }

    }

    static class IllegalExp extends Exception{
        private String message;

        public IllegalExp(String exp) {
            this.message = exp;
        }

        public void printExp () {
            System.out.println(message);
        }

        @Override
        public String getMessage() {
            return message;
        }

    }
}
