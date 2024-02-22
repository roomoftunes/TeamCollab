package week03_sandra;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(isPrime(-32));
    }

    public static boolean isPrime(int num) {
        if(num<0){
            throw new RuntimeException("Please enter positive number");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }


        return true;
    }
}