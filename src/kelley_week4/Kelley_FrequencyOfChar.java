package kelley_week4;

public class Kelley_FrequencyOfChar {

    public static void main(String[] args) {

        freqOfChar("AAABBCDD");
        freqOfChar("HELLO");
        freqOfChar("BYEBYE");
    }

    public static void freqOfChar(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if( str.charAt(i)== str.charAt(j)){
                    count++;
                }
            }

            if( !(result.contains(str.substring(i, i+1)) )){
                result += str.substring(i, i+1) + count;
            }

        }

        System.out.println(result);
    }

}
