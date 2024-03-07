package kelley_week4;

import java.util.Arrays;

public class Kelley_SameLetters {

    public static void main(String[] args) {
        System.out.println("Expecting true: " + sameLetters("cab", "bac"));
        System.out.println("Expecting true: " + sameLetters("car", "arc"));
        System.out.println("Expecting false: " + sameLetters("bbb", "ddd"));
        System.out.println("Expecting false: " + sameLetters("yes", "yess"));
    }

    public static boolean sameLetters(String str1, String str2){

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)){
            return true;
        }else{
            return false;
        }
    }

}
