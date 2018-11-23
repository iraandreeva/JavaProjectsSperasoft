package Practice3;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class QuequeDemo {

    public static void main(String[] args) {

        ArrayQueue<String> breed = new ArrayQueue<String>(32);

        breed.add("Korgi"); //Lovely breeds
        breed.add("Dalmatin");
        breed.add("Bigle");
        breed.add("Akita");
        breed.add("Buldog");
        breed.add("Mops");




        breed.remove(0); //I don't love buldogs, but it will be korgi, because of head

        System.out.println("My Queue:");


        System.out.println(breed);



    }
}