package Practice4;

import java.util.*;

public class Person implements Comparable<Person> {
    protected String name;
    protected int age;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        return this.age > o.age ? 1 : this.age < o.age ? - 1 : 0;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Person))
            return false;
        Person p = (Person)o;
        return this.getName().equals(p.getName()) && this.getAge() == p.getAge();
    }

    public static ArrayList<Person> removeDuplicates(ArrayList<Person> o) {
        o.sort(new PersonComparator());
        for (int i = 0; i < o.size() - 1; i++) {
            Person cur = o.get(i);
            Person next = o.get(i + 1);
            if(cur.equals(next)){
                o.remove(cur);
            }
        }
        return o;
    }

    public static boolean equalsLists(ArrayList<Person> l1, ArrayList<Person> l2) {
        if(l1.size() != l2.size())
            return false;
        l1.sort(new PersonComparator());
        l2.sort(new PersonComparator());
        for (int i = 0; i < l1.size(); i++) {
            if(!l1.get(i).equals(l2.get(i)))
                return false;
        }
        return true;
    }

    public static boolean listEquality(Object p1, Object p2) {
        if(p1.getClass() != p2.getClass())
            return  false;
        return ((Comparable)p1).compareTo(p2) == 0 ? true : false;
    }





}
class PersonComparator implements java.util.Comparator<Person> {

    public int compare(Person o1, Person o2) {
        return ((Comparable)o1.getName()).compareTo(o2.getName()) == 0 ? o1.getAge() - o2.getAge() : o1.getName().compareTo(o2.getName());
    }

}

