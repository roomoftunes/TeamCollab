package week5_kelley;

public class Kelley_ReverseString {


    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println(reverse("hello world"));
    }

    public static String reverse(String str){

        String reverseStr = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
