package week07_sandra;

import java.util.Arrays;

public class ArrayFindMinimum {

    public static void main(String[] args) {
        int[] array = {82,82, 4, 25,-436, 2};
        findMinimum(array);
    }

    public static void findMinimum(int[] array){
        Arrays.sort(array);
        int min = array[0];
        System.out.println("min = " + min);
    }
}
