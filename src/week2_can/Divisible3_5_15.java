package week2_can;

import java.util.Scanner;

public class Divisible3_5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Final Value");// statement for user
        int finalNumber = input.nextInt();// user input for final number

        divisible(finalNumber);// calls custom method with int finalNumber variable
    }
    public static void divisible(int a){// custom void method with int a as loop stop

        String div15 = "Divisible By 15=  ";// variable to store i
        String div5 = "Divisible By 5=   ";// variable to store i
        String div3 = "Divisible By 3=   ";// variable to store i

        for (int i = 1; i <=a; i++) {// for loop iterating through numbers one by one

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {// checks each iteration if number is divisible by 3 AND 5 AND 15
                div15 += i + " ";

            } else if (i % 5 == 0 && (!(i % 15 == 0))) {// checks each iteration if number is divisible by 5 AND NOT 15
                div5 += i + " ";

            } else if (i % 3 == 0 && (!(i % 15 == 0))) {// checks each iteration if number is divisible by 3 AND NOT 15
                div3 += i + " ";
            }
        }
        System.out.println(div15 + "\n" + div5 + "\n" + div3);// prints to console the int variables
    }
}
