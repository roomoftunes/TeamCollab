package Week3_ahmet;

import java.sql.SQLOutput;

public class Prime_Number {
    public static void main(String[] args) {
        //
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
        System.out.println(isPrime(13));
    }
    public static boolean isPrime(int n) {
        // any number below two is not prime
        if (n < 2) {
            return false;
        }
        // I am checking if the number is divisible by any other number
        for (int i = 2; i < n; i++) {
            // check if the number is divisible with any  number return false
            if (n % i == 0) {
                return false;
            }
        }
    return true;
    }
}
 /*
        Prime

        Create a method to check if the given N is a prime number
            parameter: int
            return: boolean

        A number is prime if it is only divisible by one and itself

        Ex:
            7 -> prime, because only 1 and 7 can be divided evenly
            6 -> not prime, because 6 is divisible by 2 and 3 also
     */
