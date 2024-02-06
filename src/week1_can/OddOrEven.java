package week1_can;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");// statement for user
        int number = input.nextInt();// user input for number

        oddOrEven(number);// calls custom method with int number variable
    }
    public static void oddOrEven(int a){// custom void method with int a

            int num = a;

            if(a % 2 == 0){// checks if number is divisible by 2 no remainder
                System.out.println(a + " is Even");

            }else {// if above statement is false then number is Odd
                System.out.println(a + " is Odd");
        }
    }
}
