package kelley_week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kelley_ArraySortAscending {

    public static void main(String[] args) {

        int[] array1 = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortAscending(array1)));
    }

    public static int[] sortAscending(int[] intArray){

        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = 0; j < intArray.length-i-1; j++) {
                if (intArray[j] > intArray[j+1]){
                    int tempNum = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = tempNum;
                }
            }
        }

        return intArray;
    }
}
