package week_3;

import java.util.Scanner;

public class ReverseNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a negative number");
        int num = in.nextInt();
        System.out.println(reverseNegative(num));

    }
    public static int reverseNegative (int num){
        num = Math.abs(num);
        int reverse = 0;

        while (num>=1){
        int firstR = num%10;
        reverse = reverse*10+firstR;
        num = num/10;}

    return reverse*-1;}
}
