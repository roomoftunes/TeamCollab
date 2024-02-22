package anastasiya_week_4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";
        System.out.println(sameLetters(str1, str2));
    }
    public static boolean sameLetters(String str1, String str2){
    char [] s1 = str1.toCharArray();
    char [] s2 = str2.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
    if (Arrays.equals(s1, s2)){
        return true;
    } else {return false;}

}
}
