package anastasiya_week_4;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word or phrase");
        String str = in.nextLine();
        System.out.println(frequencyOfChar(str));
    }

    public static String frequencyOfChar(String str){
        String r = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (!r.contains(ch + "")) {
                r +=ch+""+count+"";
            }
            if (Character.isDigit(ch)){
                String chPlus = "("+ch+")";
                if (!r.contains(chPlus)){
                    r+=chPlus+count;
                }
            }
        }
        return r;
    }
}
