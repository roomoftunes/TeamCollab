package week1_can;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Final Value");// statement for user
        int finalNumber = input.nextInt();// user input for final number

        FINRA(finalNumber);// calls custom method with int finalNumber variable
    }
    public static void FINRA(int a){// custom void method with int a as loop stop

        for (int i = 1; i <=a; i++) {// for loop iterating through numbers one by one

            if(i % 5 == 0 && i % 3 == 0){// checks each iteration if number is divisible by 3 AND 5
                System.out.println("FINRA");

            }else if(i % 5 == 0){// checks each iteration if number is divisible by 5
                System.out.println("RA");

            }else if(i % 3 == 0){// checks each iteration if number is divisible by 3
                System.out.println("FIN");

            }else{// if not divisible by 5 or 3 or 5 and 3 then prints the iterator
                System.out.println(i);
            }
        }
    }
}
