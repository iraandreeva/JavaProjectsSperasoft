package Practice3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> breed = new HashSet<>();

        breed.add("Korgi");
        breed.add("Dalmatin");
        breed.add("Bigle");
        breed.add("Akita");
        breed.add("Buldog");
        breed.add("Mops");

        //breed.;//нет замены элемента

        breed.remove("Buldog");

        System.out.println("My HashSet:");
        for (String s: breed) {
            System.out.print(s + "\t");

        }

        //нет встроенной сортировки


    }
}
