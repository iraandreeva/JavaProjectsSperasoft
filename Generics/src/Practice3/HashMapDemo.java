package Practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> breed = new HashMap<>();


        breed.put(0, "Korgi"); //Lovely breeds
        breed.put(2, "Dalmatin");
        breed.put(5, "Bigle");
        breed.put(1, "Akita");
        breed.put(3, "Buldog");
        breed.put(4, "Mops");

        breed.replace(1, "Akita inu");//Ooops, mistake


        breed.remove(3); //I don't love buldogs

        List list = new ArrayList(breed.entrySet());

        System.out.println("My HashMap:");
            System.out.print(list + "\t");

        }



        //нет встроенной сортировки
}
