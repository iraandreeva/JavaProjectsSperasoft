package Practice4;

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

    public static int compare(Person o1, Person o2) {
        return ((Comparable)o1.getName()).compareTo(o2.getName()) == 0 ? o1.getAge() - o2.getAge() : o1.getName().compareTo(o2.getName());
    }

    public int removeDuplicates(Person o) {
        return 0;
    }

    public static boolean listEquality(Object p1, Object p2) {
        if(p1.getClass() != p2.getClass())
            return  false;
        return ((Comparable)p1).compareTo(p2) == 0 ? true : false;
    }





}
