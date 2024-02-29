package Lussa_week3;

public class TaskWeek3 {
    public void primeNumber() {
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");


    }

// System.out.println("---------------------------------------")

        public static void reverse(int number) {
            if (number < 0) {
                System.out.print("-");
                reverse(number * -1);
            } else if (number < 10) {
                System.out.println(number);
            } else {
                System.out.print(number % 10);
                reverse(number / 10);
            }
        }
}



//1. Numbers -- Prime Number
//Write a method that can check if a number is prime or not

//A prime number is a number that is divisible by only two numbers: 1 and itself.
// So, if any number is divisible by any other number, it is not a prime number.

//2. Numbers -- Reverse negative number
//Write a return method that can reverse negative number and return it as int
