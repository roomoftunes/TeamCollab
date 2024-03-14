package kelley_week4;

public class Kelley_RemoveDuplicates {

        public static void main(String[] args) {
            System.out.println(removeDup("AAABBBCCC"));
            System.out.println(removeDup("ccyyyyydeeeeoooo"));
            System.out.println(removeDup("111222344455"));
        }

        public static String removeDup(String str) {

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (!(result.contains(str.substring(i, i + 1)))) {
                    result += str.substring(i, i + 1);
                }
            }
            return result;
        }
    }