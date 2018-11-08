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

            //Подзадание 1
            System.out.println("Первая часть (которую я не поняла и не нужно было делать). " +
                    "Ввести 2 числа с клавиатуры: вычислить размер массива и найти число");
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


            System.out.println(" ");
            System.out.println(" ");

            //Подзадание2
            System.out.println("Вторая часть(правильная): создание рандомного массива размера" +
                    "(введенного с клавиатуры) и поиск заданного числа в нем. Число задали в первом задании.");
            //Generate a random array of integers of provided size and print it
            System.out.println("Enter array's size:");
            Scanner size = new Scanner(System.in);
            int sizee = size.nextInt();
            int RandomArray[] = new int[sizee];

            System.out.println("Array:");
            for (int i=0; i < RandomArray.length; i++)
            {
                RandomArray[i] = (int)(Math.random()*9+1);

            }
            System.out.println(" ");

            System.out.println(Arrays.toString(RandomArray));




            //regular search one by one;
            double start2 = System.nanoTime();
            if (FindNumber(RandomArray, NumToFind) >= 0)
                System.out.println("TRUE. The number's index is = " + FindNumber(RandomArray, NumToFind));
            else
                System.out.println("FALSE. No such number in our array");
            double finish2 = System.nanoTime();
            double result2 = finish2 - start2;




            //binary search
            double start1 = System.nanoTime();
            Arrays.sort(RandomArray);
            System.out.println(Arrays.toString(RandomArray));
            if (Arrays.binarySearch(RandomArray, NumToFind)>= 0)
                System.out.println("TRUE. The number's index is = " + Arrays.binarySearch(RandomArray, NumToFind));
            else
                System.out.println("FALSE. No such number in our array");
            double finish1 = System.nanoTime();
            double result1 = finish1 - start1;

            System.out.println(" ");
            System.out.println("Time binary search = " + result1);
            System.out.println("Time search one by one = " + result2);
            System.out.println("Boost = " + result1/result2);
        }



        //regular search one by one;
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
                else
                    index = -3;

            }

            return index;
        }



}
