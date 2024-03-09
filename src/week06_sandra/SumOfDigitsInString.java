package week06_sandra;

public class SumOfDigitsInString {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("as98s2u20sh2"));
    }

    public static int sumOfDigits(String string){
        Integer sum=0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))){
              sum += Integer.parseInt(String.valueOf(string.charAt(i)));
            }
        }
        return sum;
    }

}
