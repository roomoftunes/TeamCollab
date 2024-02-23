package week04_sandra;

public class FrequencyOfChars {
    public static void main(String[] args) {
        System.out.println(findFrequency("AAABBCCCCDFF22"));
    }

    public static String findFrequency(String str){
        String frequency = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(str.substring(0,i).contains(ch + "")){
                continue;
            }
            frequency += ch + "" + count;
        }
        return frequency;
    }
}
