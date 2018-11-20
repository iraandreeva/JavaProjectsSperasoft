import java.util.Random;
import java.util.Scanner;

public class DogsDemo {

    public static void main(String[] args) {
        int dogNumber;

        System.out.println("Enter dogs number: ");
        Scanner n = new Scanner(System.in);
        dogNumber = n.nextInt();
        String str = new String();
        str = "";
        int a;
        Dog[] dogs = new Dog[dogNumber];
        for (int i = 0; i < dogNumber; i++) {
            dogs[i] = new Dog();
            System.out.println("Enter dog's #" + i  + " name:");
            Scanner na = new Scanner(System.in);
            dogs[i].name = na.nextLine();
            if (dogs[i].name.isEmpty())
                dogs[i].defaultName();
            System.out.println("Enter dog's #" + i + " age from 1 to 20:");
            String test = na.nextLine();
            if (test.isEmpty())
                dogs[i].getRandomAge();
            else {
                a = Integer.parseInt(test);
                dogs[i].age = a;
            }
            while (dogs[i].age < 1 || dogs[i].age > 20) {
                System.out.println("Age of the dog cannot be more than 20 years and less than 1. ReEnter!");
                System.out.println("Enter dog's #" + i + " age from 1 to 20:");
                test = na.nextLine();
                if (test.isEmpty())
                    dogs[i].getRandomAge();
                else {
                    a = Integer.parseInt(test);
                    dogs[i].age = a;
                }
            }
            System.out.println("Enter dog's #" + i + " size: small, medium or big");
            dogs[i].size = na.nextLine();
            if (dogs[i].size.isEmpty())
                dogs[i].getRandomSize();
            else if (dogs[i].size.equals("small") == false || dogs[i].size.equals("medium") == false || dogs[i].size.equals("big") == false) {
                System.out.println("The dog size can be only: small. medium or big. ReEnter!");
                System.out.println("Enter dog's #" + i + " size: small, medium or big");
                dogs[i].size = na.nextLine();
               break;
            }
        }

        System.out.println("Your dogs:");
        for (int i = 0; i < dogNumber ; i++) {
            dogs[i].Print();
        }
    }
}

class Dog {

    String name;
    int age;
    int minAge = 1, maxAge = 20;
    String size;


    private static final Random random = new Random();

    /*public enum size {
        big,
        medium,
        small;

        private static final size[] val = values();
        private static final int sz = val.length;
        public static size getRandomSize()  {
            return val[random.nextInt(sz)];
        }
    }*/

   public void defaultName() {
        String[] names = {"Barbos", "Pes", "Bolonka", "Selezenka"};
        name = names[random.nextInt(names.length)];
    }

    public void getRandomAge() {
        age = minAge + random.nextInt(maxAge - minAge + 1);

    }

    public void getRandomSize() {
        String[] sizes = {"big", "medium", "small"};
       size = sizes[random.nextInt(sizes.length)];
    }

    public void Print() {
        System.out.printf("Name = %s, Age = %d, Size = %s \n", name, age, size);
    }
}
