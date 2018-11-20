public class MyMath {


   public static int minArray(int[] array) {
       int min = array[0];
       for (int i = 1; i < array.length; i++) {
           if (min > array[i]) {
               min = array[i];
           }
       }
       return min;
   }

    public static double minArray(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static double maxArray(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int nextAfter(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                return array[i];
            }
        }
        return 0;
    }

    public double nextAfter(double[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                return array[i];
            }
        }
        return 0;
    }

    public double pow(int number1, int number2) {
       int res = number1;
       if (number2 == 0)
           return 1;
       for (int i = 1; i < abs(number2); i++) {
            res *= number1;

        }
        return number2 < 0 ? 1.0/res : res;
    }

    public int abs(int number) {
       if (number < 0)
           return -number;
       return number;
    }

    public double abs(double number) {
        if (number < 0)
            return -number;
        return number;
    }

    public double pow(double number1, int number2) {
        double res = number1;
        if (number2 == 0)
            return 1;
        for (int i = 1; i < abs(number2); i++) {
            res *= number1;

        }
        return number2 < 0 ? 1.0/res : res;
    }

}
