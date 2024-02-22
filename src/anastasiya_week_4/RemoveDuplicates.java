package anastasiya_week_4;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbbccc333";
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char each: ch){
            set.add(each);
        }
        str = "";
        for (Character each: set){
        str += each;}
        System.out.println(str);






    }
    public static void removeDuplicates(String str){




    }

}
