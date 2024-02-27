package week03_sandra;

public class Negative {
    public static int reverseNegative(int num) {
        if(num<0){
            num = num * -1;
        }else{
            throw new IllegalArgumentException("Given number not negative");
        }
        return num;
    }

    }
