package anastasiya_week_1;

public class Odd_even {
    public static void main(String[] args) {
        int n = 5;
        oddEven(n);

    }
    public static void oddEven(int number){
        if (number%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
