package Week2_ahmet;

public class Swap_Numbers {
    public static void main(String[] args){

        int  a = 33;
        int  b = 23;

        System.out.println(" before swap a is : " + a);
        System.out.println(" before swap b is : " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a is : " + a);
        System.out.println(" b is : " + b);


    }
}
