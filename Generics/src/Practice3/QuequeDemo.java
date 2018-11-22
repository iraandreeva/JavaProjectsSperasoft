package Practice3;

import java.util.*;

public class QuequeDemo {

    public static void main(String[] args) {

        Queue<String> breed = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        breed.add("Korgi"); //Lovely breeds
        breed.add("Dalmatin");
        breed.add("Bigle");
        breed.add("Akita");
        breed.add("Buldog");
        breed.add("Mops");

        //breed.set(3, "Akita inu"); //Ooops, mistake

        breed.remove(); //I don't love buldogs

        /*System.out.println("My Queue:");
        for (Object s: breed) {
            System.out.print(s);

        }*/

        System.out.println(breed);

        //Collections.sort(breed);

        /*System.out.println("\n\nMy sorted ArrayList:");
        for (String s: breed) {
            System.out.print(s + "\t");

        }*/

    }
}