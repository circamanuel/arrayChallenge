import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

       Integer[] firstArray = getRandomArray(10); //creating new item firstArray and asigning the lengt of 10
       System.out.println(Arrays.toString(firstArray));

       Arrays.sort(firstArray); // Sort array
        System.out.println(Arrays.toString(firstArray));


        Integer[] sortedArray = sortArray(new Integer[] {7, 33, 673, 34, 86, 2345346, 1});

    }

    private static Integer[] getRandomArray(Integer len) {


        Random rand = new Random(); // creating Random Object
       Integer[] randomInt = new Integer[len];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = rand.nextInt(99); // storing random int in integer
        }
        return randomInt;
    }

    public static Integer[] sortArray(Integer[] array) {

        System.out.println(Arrays.toString(array));
        Integer[] sortedArray = Arrays.copyOf(array, array.length);
         boolean flag = true;
         while (flag) {
             flag = false;
             for (int i = 0; i < sortedArray.length - 1; i++) {
                 Integer temp;
                 if (sortedArray[i] < sortedArray[i + 1]) {
                     temp = sortedArray[i];
                     sortedArray[i] = sortedArray[i + 1];
                     sortedArray[i + 1] = temp;
                     System.out.println(Arrays.toString(sortedArray));
                     flag = true;
                 }
             }
             System.out.println(Arrays.toString(sortedArray));

        }
         return sortedArray;
    }

}
