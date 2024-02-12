package Week3_ahmet;

public class Reverse_Negative_Number {
    public static void main(String[] args) {
        int number = -123;
        int reversedNumber = 0;

        // Check if the number is negative
        if (number < 0) {
            // Convert the number to positive
            number = number * -1;
        }

        // Reverse the number
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        // Print the reversed number
        System.out.println(reversedNumber);
    }
}
