package Practice4;

//Collections Practice #2: Person List
//Implement a Person class with the following fields:
//name - String
//age - int
//Make the Person class implement Comparable interface (only age should be compared)
//Implement a comparator for the Person class comparing Person first by name and if the name is equal by age.
//Implement a method that accepts a list of Person objects and returns a list with unique Person objects (objects with the same name and age should be removed)
//Implement a method that accepts two lists of Person objects and returns a boolean depending on passed lists equality.
//Write a simple demo program to test:
//sorting of the Person list without comparator;
//sorting of the Person list using implemented comparator;
//both methods for removing duplicates and comparing two lists.

import java.util.*;

public class PersonDemo {

    public static void main(String[] args) {

        ArrayList<Person> demo = new ArrayList<>();
        demo.add (new Person("Valera", 23));
        demo.add (new Person("Oleg", 45));
        demo.add (new Person("Kirill", 65));
        demo.add (new Person("Vitaly", 23));
        demo.add (new Person("Valera", 24));

        System.out.println("My ArrayList:");
        for (Person s: demo) {
            System.out.println(s.getName() + "\t" + s.getAge() + "\t");

        }



        //sorting of the Person list without comparator
        //Collections.sort(demo);

        //sorting of the Person list using implemented comparator
        Collections.sort(demo, Comparator.comparing(Person::getName)
                .thenComparingInt(Person::getAge));

        System.out.println("\nMy sorted ArrayList:");
        for (Person s: demo) {

            System.out.println(s.getName() + "\t" + s.getAge() + "\t");

        }
        

        System.out.println("\nRemoved duplicates:");
        for (Person s: demo) {

            System.out.println(s.getName() + "\t" + s.getAge() + "\t");

        }


    }
}
