package week05_sandra;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String string){
        String reverse = "";
        for (int i = string.length()-1; i >=0; i--) {
            reverse+= string.charAt(i);
        }
        return reverse;
    }
}
