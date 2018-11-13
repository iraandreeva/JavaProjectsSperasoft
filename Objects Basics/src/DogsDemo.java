import java.util.Random;
import java.util.Scanner;

public class DogsDemo {

    public static void main(String[] args) {
        int dogNumber;

        System.out.println("Enter dogs number: ");
        Scanner n = new Scanner(System.in);
        dogNumber = n.nextInt();
        
        Dog[] dogs = new Dog[dogNumber];
        for (int i = 0; i < dogNumber; i++) {
            System.out.println("Enter dog's #" + i  + " name:");
            dogs[i].name = n.nextLine();
            if (dogs[i].name == "")
                dogs[i].defaultName();
            System.out.println("Enter dog's #" + i + " age:");
            dogs[i].age = n.nextInt();
            if (dogs[i].age == 0)
                dogs[i].getRandomAge();
            System.out.println("Enter dog's #" + i + " size:");
            dogs[i].size = n.nextLine();
            if (dogs[i].size == "")
                dogs[i].
        }
    }
}

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

   public void defaultName() {
        String[] names = {"Barbos", "Pes", "Bolonka", "Selezenka"};
        name = names[random.nextInt(names.length)];
    }

    public void getRandomAge() {
        int number = minAge + random.nextInt(maxAge - minAge + 1);

    }





}
