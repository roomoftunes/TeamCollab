package week1_can;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter dividend");// Statement for user
        int dividend = input.nextInt();// user input for dividend
        System.out.println("Enter divisor");// Statement for user
        int divisor = input.nextInt();// user input for divisor

        System.out.println(divideWithoutRemainder(dividend, divisor));// calls custom method and prints while using the int inputs for dividend and divisor
    }
    public static String divideWithoutRemainder(int dividend, int divisor) {
        int count2 = 0;// keeps track of divisor count into dividend
        int divisor1 = 0;// keeps track of divisor as it is updated in loop


        if (divisor == 0)// solves a divide by Zero error
            System.err.println("Cannot Divide By 0 :-(");
        else if (divisor == 1)// returns dividend due to divide by 1
            System.out.println(dividend);
        else if (divisor > 1) {// valid division case
            for (int i = divisor; i <= dividend; i += divisor) {// loop to count whole attempts of divisor into dividend, updating divisor each iteration
                count2++;// adds each time divisor goes into dividend without passing it
                divisor1 += divisor;// updates new divisor
            }
        }
        String answer = dividend + " divided by " + divisor + " equals " + count2 + " with a remainder of " + (dividend - divisor1);// my own print statement

        return answer;// returns my print statement with the solution
    }
}
