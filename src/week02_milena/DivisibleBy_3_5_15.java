package week02_milena;

public class DivisibleBy_3_5_15 {

    public static void main(String[] args) {

        int n = 100;

        String divisibleBy15 = "",
                divisibleBy5 = "",
                divisibleBy3 = "";

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";

            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            }

        }

        System.out.println("Divisible by: " + divisibleBy15);
        System.out.println("Divisible by: " + divisibleBy5);
        System.out.println("Divisible by: " + divisibleBy3);

    }
}
