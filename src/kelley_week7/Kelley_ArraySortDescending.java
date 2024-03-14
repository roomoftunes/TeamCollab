package kelley_week7;

import java.util.Arrays;

public class Kelley_ArraySortDescending {

    public static void main(String[] args) {

        int[] array1 = {9, 10, 7, 8};
        System.out.println(Arrays.toString(sortDescending(array1)));
    }

    public static int[] sortDescending(int[] intArray){

        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = 0; j < intArray.length-i-1; j++) {
                if (intArray[j] < intArray[j+1]){
                    int tempNum = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = tempNum;
                }
            }
        }

        return intArray;
    }
}
