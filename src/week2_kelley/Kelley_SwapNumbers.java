package week2_kelley;

public class Kelley_SwapNumbers {

    public static void main(String [] args){

        int a = 10;
        int b = 20;

        a = a + b;     // a = 30
        b = a - b;     // b = 10  (30-20)
        a = a - b;     // a = 20  (30-10)

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
