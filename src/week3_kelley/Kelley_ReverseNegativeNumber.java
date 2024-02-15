package week3_kelley;

public class Kelley_ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseIfNegative(-125));
        System.out.println(reverseIfNegative(-1));
        System.out.println(reverseIfNegative(0));
        System.out.println(reverseIfNegative(50));
        System.out.println(reverseIfNegative(475));
    }

    public static int reverseIfNegative(int num){

        if(num < 0){
            return num + (num*-2);
        }else {
            return num;
        }
    }
}
