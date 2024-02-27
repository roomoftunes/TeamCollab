package week02_sandra;

public class SwapNumbers {

    public static void main(String[] args) {
        swap(10,20);
    }

    public static void swap(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
