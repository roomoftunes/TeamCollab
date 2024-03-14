package kelley_week7;

import java.util.Arrays;

public class Kelley_ArrayFindMinimum {

    public static void main(String[] args) {

        int[] array1 = {5, 10, 15, 12, 1, 22, 100};
        System.out.println(findMin(array1));

        int[] array2 = {-1, 10, -15, 12, 1, 22, 100};
        System.out.println(findMin(array2));
    }


    public static int findMin( int[] intArray){
        int min = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        return min;
    }
}
