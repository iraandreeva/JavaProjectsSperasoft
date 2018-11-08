import java.util.Scanner;
import java.util.Arrays;

public class JavaFundamentalsPractice2 {

       /*
       Java Fundamentals Practice #2: Search for an element in the array

Implement a program that takes 2 integer numbers from the console:

array size;
a number to search in the array.

Generate a random array of integers of provided size and print it.
Verify if the provided element is present in the array. If it does print true otherwise print false.

Use several search algorithms. For example:

regular search one by one;
binary search.
Compare execution time for each algorithm.
        */




        public static void main(String[] args) {
            //Implement a program that takes 2 integer numbers from the console:
            int integers[]= new int[2];
            System.out.println("Enter first number:");
            Scanner int1 = new Scanner(System.in);
            integers[0] = int1.nextInt();
            System.out.println("Enter second number:");
            Scanner int2 = new Scanner(System.in);
            integers[1] = int2.nextInt();


            //array size;
            System.out.println("Array's length = " + integers.length);

            //a number to search in the array
            System.out.println("Enter number to find:");
            Scanner int3 = new Scanner(System.in);
            int NumToFind = int3.nextInt();

            //Doesn't work properly
            //if (NumToFind == FindNumber(integers, NumToFind))
               // System.out.println("The number's index is = " + FindNumber(integers, NumToFind));
            //else
             //   System.out.println("No such number in our array");

            int index = 0;
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] == NumToFind) {
                    index = i;
                    System.out.println("The number's index is = " + index);
                }
            }

            /* Не реализовала вывод сообщения, если такого числа в массиве нет
            if (integers != NumToFind)
                {
                    System.out.println("No such number in our array");
                }
                */

            //System.out.println("The number's index is = " + Arrays.binarySearch(integers, NumToFind));









        }


        public static int FindNumber (int[] array, int number)
        {
            int index = 0;
            for (int i = 0; i < array.length; i++)
            {
                if (array[i] == number)
                {
                    index = i;
                    break;
                }

            }

            return index;
        }



}
