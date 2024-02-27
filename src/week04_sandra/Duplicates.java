package week04_sandra;

public class Duplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AABCCBCAA22"));
    }

    public static String removeDuplicates(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if(newString.contains(eachLetter +"")){
                continue;
            }
            newString += eachLetter + "";
        }
        return newString;
    }
}
