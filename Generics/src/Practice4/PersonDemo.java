package Practice4;

import java.util.*;

public class PersonDemo {

    public static void main(String[] args) {

        ArrayList<Person> demo = new ArrayList<>();
        demo.add (new Person("Valera", 23));
        demo.add (new Person("Oleg", 45));
        demo.add (new Person("Kirill", 65));
        demo.add (new Person("Vitaly", 23));
        demo.add (new Person("Valera", 23));
        demo.add (new Person("Valera", 21));

        ArrayList<Person> demo2 = new ArrayList<>(demo);

        System.out.println("My ArrayList:");
        for (Person s: demo) {
            System.out.println(s.getName() + "\t" + s.getAge() + "\t");

        }



        //sorting of the Person list without comparator
        //Collections.sort(demo);

        //sorting of the Person list using implemented comparator
        Collections.sort(demo, new PersonComparator());

        System.out.println("\nMy sorted ArrayList:");
        for (Person s: demo) {

            System.out.println(s.getName() + "\t" + s.getAge() + "\t");

        }

        demo = Person.removeDuplicates(demo);

        System.out.println("\nRemoved duplicates:");
        for (Person s: demo) {

            System.out.println(s.getName() + "\t" + s.getAge() + "\t");

        }

        System.out.println("\nCompare lists:");
        System.out.println(Person.equalsLists(demo, demo2) ? "Lists are equals" : "Lists are different");
    }
}
