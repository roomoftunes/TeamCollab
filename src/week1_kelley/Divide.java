package week1_kelley;

public class Divide {

    public static int divide(int num1, int num2) {

        int result = 0;

        if(num1 > num2){
            while (num1 > 0){
                num1 -= num2;
                result++;
            }
        }

        return result;
    }

}
