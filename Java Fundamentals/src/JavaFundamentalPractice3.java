import java.util.Arrays;
import java.util.Scanner;

public class JavaFundamentalPractice3 {

/*
Sort random array (number of arguments should be taken from in the console) of integer numbers using at least 2 of the following sort algorithms:

bubble sort;
optimized bubble sort;
insertion sort;
selection sort.
 */

    public static void main(String[] args) {

        //Generate a random array of integers of provided size and print it
        System.out.println("Enter array's size:");
        Scanner size = new Scanner(System.in);
        int sizee = size.nextInt();
        int RandomArray[] = new int[sizee];

        System.out.println("Array:");
        for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = (int) (Math.random() * 19 + 1);

        }

        System.out.println(" ");
        System.out.println(Arrays.toString(RandomArray));

        //bubblesort(RandomArray);
        selectionsort(RandomArray);



    }
    //bubble sort
    public static void bubblesort(int[] array) {

        int temp;

        for (int k = array.length - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }

        System.out.println("Bubble sorted array:");
        System.out.println(Arrays.toString(array));
    }

    //selection sort

    public static void selectionsort (int[] array)
    {


        for (int k = 0; k < array.length-1; k++) {
            int temp, min = k, i;
            for (i = k+1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
                    if (k != min) {
                        temp = array[k];
                        array[k] = array[min];
                        array[min] = temp;
                    }



        }

        System.out.println("Selection sorted array:");
        System.out.println(Arrays.toString(array));

    }



}


