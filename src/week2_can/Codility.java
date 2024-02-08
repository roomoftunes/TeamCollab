package week2_can;

import java.util.Scanner;

public class Codility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Final Value");// statement for user
        int N = input.nextInt();// user input for final Value

        codilityCode(N);// calls custom method with int n variable
    }
    public static void codilityCode(int n){// custom void method with int a as loop stop

        String divAll = ""; //storing each string and or iteration

        for (int i = 1; i <=n; i++) {// for loop iterating through numbers one by one

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {// checks each iteration if number is divisible by 2 AND 3 AND 5
                divAll += "CodilityTestCoders \n";//adds value to divAll Variable

            } else if (i % 2 == 0 && i % 3 == 0) {// checks each iteration if number is divisible by 2 AND 3
                divAll += "CodilityTest \n";//adds value to divAll Variable

            }else if (i % 2 == 0 && i % 5 == 0) {// checks each iteration if number is divisible by 2 AND 5
                divAll += "CodilityCoders \n";//adds value to divAll Variable

            }else if (i % 3 == 0 && i % 5 == 0) {// checks each iteration if number is divisible by 3 AND 5
                divAll += "TestCoders \n";//adds value to divAll Variable

            }else if (i % 2 == 0) {// checks each iteration if number is divisible by 2
                divAll += "Codility \n";//adds value to divAll Variable

            }else if (i % 3 == 0) {// checks each iteration if number is divisible by 3
                divAll += "Test \n";//adds value to divAll Variable

            }else if (i % 5 == 0) {// checks each iteration if number is divisible by 5
                divAll += "Coders \n";//adds value to divAll Variable

            }else
                divAll += i + "\n";//adds i to divAll Variable
        }
        System.out.println(divAll);// prints to console
    }
}
