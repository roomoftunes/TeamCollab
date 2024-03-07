package anastasiya_week_6;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String str = "dkjvsaq3y7r78wey7788u9uu8y78jsbjh!!wfl@";
        System.out.println(sumOfDigits(str));
    }
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum+=Integer.parseInt(str.charAt(i)+"");
            }
        }
    return sum;}
}
