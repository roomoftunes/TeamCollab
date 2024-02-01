package Lussa_week1;

public class Task1 {

    public static void main(String[] args) {
        //write a method that can divide given number is even or odd

        int number = 100;

        boolean isEven = number % 2 == 0;  // When we a number by 2, if the remainder is zero, it means the number is even

        // boolean isOdd = number % 2 != 0; // When we a number by 2, if the remainder is NOT zero, it means the number is odd

        boolean isOdd = !isEven; // if the number is not even, then it's odd

        //  System.out.println(number + " is an even number: " +  isEven );
        // System.out.println(number + " is an odd number: " + isOdd );


    //    System.out.println(--------------------)
        //Task 2
        //Write a method that can divide two numbers without using division operator

        //Task 3
        //FINRA :
        //Write a method which prints out the numbers from 1 to 30 but for numbers which
        //are a multiple of 3print "FIN" instead of the number and for numbers which are a
        //multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
        //both 3 and 5, print "FINRA" instead of the number.
    }

}


