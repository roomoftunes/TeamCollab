package week04_sandra;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(isSameLetters("abb", "cba"));
    }

    public static boolean isSameLetters(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    }
}
