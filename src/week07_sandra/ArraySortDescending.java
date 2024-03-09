package week07_sandra;

import java.util.Arrays;

public class ArraySortDescending {

    public static void main(String[] args) {
        int[] array = {93, 32,-3, 67, 100, 3, 21};
        sortDescending(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortDescending(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int hold= array[j];
                if(array[j] < array[j + 1]){
                    array[j] = array[j+1];
                    array[j+1] = hold;
                }
            }
        }
        return array;
    }
}
