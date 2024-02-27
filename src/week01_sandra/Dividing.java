package week01_sandra;

public class Dividing {

    public static void divideWithoutOperator(int num1, int num2){


        int count = 0;

        if(num1>num2) {

            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
        }
        System.out.println(count + " with a remainder of " + num1);
    }
}


