package week2_can;

public class ValueSwap {
    public static void main(String[] args) {
        int a  = 50;
        int b = 75;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;// a+b 50+75 after- a = 125 b = 75
        b = a - b;// a-b 125-75 after- b = 50 a = 125
        a = a - b;// a-b 125-50 after- a = 75 b = 50

        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
