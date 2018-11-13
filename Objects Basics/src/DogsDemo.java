import java.util.Random;

public class DogsDemo {

    public static void main(String[] args) {
        int dogNumber;

        //From the console, the user specifies the number of dogs and names\age\size for as many dogs as he wants (divided by space)
        //An array of dogs is created based on user input. Sort generated array by name, size and age in ascending or descending order.
        //Print out the array after sorting by each field.

    }
}

//Create class Dog with the following fields: name, size (one of 3 options big, small, medium), age 1 to 20
//The user can specify any or none of the values for name, age or size when creating a new Dog
//from the console\file user specifies the number of dogs and names for as many dogs as he wanted (divided by space); Example: '10 Penny Sheldon Leonard').
//If the name isn't provided, it should be auto-generated;
//If age isn't provided, it should be auto-generated (1 to 20);
//If size isn't provided, it should be auto-generated.

class Dog {

    String name;
    int age;
    int minAge = 1, maxAge = 20;
    private static final Random random = new Random();

    public enum size {
        big,
        medium,
        small;

        private static final size[] val = values();
        private static final int size = val.length;


        public static size getRandomSize()  {
            return val[random.nextInt(size)];
        }
    }

   public void defaultName(String name) {
        name = "Barbos";
    }

    public void randomAge() {
        int number = minAge + random.nextInt(maxAge - minAge + 1);

    }





}
