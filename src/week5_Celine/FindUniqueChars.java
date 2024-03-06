package week5_Celine;

public class FindUniqueChars {


    public static String findUnique(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
                result += ""+str.charAt(i);

        }
        return result;


    }

}
