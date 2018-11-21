package Practice3;

//Collections Practice #1: Collections Test
//Implement a separate demo program for each of the following collections:
//ArrayList
//HashSet
//HashMap
//Queue
//For each collection test following actions (if applicable to the collection type):
//add element
//edit some element
//remove some element
//sort elements
//iterate through the collection printing each element
//Also, you may test other collection types or\and other methods provided by the collection itself or by the Collections class.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {

        public static void main(String[] args) {

            ArrayList<String> breed = new ArrayList<>();

            breed.add("Korgi"); //Lovely breeds
            breed.add("Dalmatin");
            breed.add("Bigle");
            breed.add("Akita");
            breed.add("Buldog");
            breed.add("Mops");

            breed.set(3, "Akita inu"); //Ooops, mistake

            breed.remove("Buldog"); //I don't love buldogs

            System.out.println("My ArrayList:");
            for (String s: breed) {
                System.out.print(s + "\t");

            }

            Collections.sort(breed);

            System.out.println("\n\nMy sorted ArrayList:");
            for (String s: breed) {
                System.out.print(s + "\t");

            }



        }
    }



