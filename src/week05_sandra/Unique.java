package week05_sandra;

public class Unique {

    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
    }

    public static String findUnique(String string){
        String unique = "";
        for (int i = 0; i < string.length(); i++) {
            int count = 0;
            for (int j = 0; j < string.length(); j++) {
                if(string.charAt(j)== string.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                unique+= string.charAt(i);
            }
        }
        return unique;
    }

}
