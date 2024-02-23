package anastasiya_week_5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        String str = "aaabbbcee444!!1%k)ff2";
        System.out.println(findUniqueElements(str));
    }

    public static String findUniqueElements(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                unique += ch + "";
            }
        }
        return unique;
    }
}
