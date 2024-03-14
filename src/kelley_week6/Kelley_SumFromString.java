package kelley_week6;

public class Kelley_SumFromString {

    public static void main(String[] args) {

        String str1 = "12345";
        System.out.println(sumOfDigits(str1));

        String str2 = "a12bc345h!";
        System.out.println(sumOfDigits(str2));

    }

    public static int sumOfDigits(String str){
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if ( Character.isDigit(str.charAt(i)) ){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }
}
