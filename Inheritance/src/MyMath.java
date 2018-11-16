public class MyMath {
   private int number;
   private int[] array;
   private int min;
   private int max;


   public int minArray(int[] array) {
       for (int i = 0; i < array.length; i++) {
           min = array[i];
           if (min > array[i+1]) {
               min = array[i+1];
           }
            i++;
       }
       return min;
   }

    public int maxArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            if (max < array[i+1]) {
                max = array[i+1];
            }
            i++;
        }
        return max;
    }

}
