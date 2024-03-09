package week06_sandra;

import java.util.Arrays;

public class ArrayFindMaximum {

    public static void main(String[] args) {
        int[] array = {78,90,45,43,26,7,2};
        System.out.println(findMax(array));
    }

    public static int findMax(int[] array){
        Arrays.sort(array);
        int max = array[array.length-1];
        return max;
    }


}
