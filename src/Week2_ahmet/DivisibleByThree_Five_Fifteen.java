package Week2_ahmet;

public class DivisibleByThree_Five_Fifteen {
    public static void main(String[] args) {

       int k;
        System.out.print("divisible by 3 :");

        for (k = 1; k<= 100; k++) {
            if (k % 15 == 0) {
                System.out.print(k + ", ");
            }
        }

            int l;
            System.out.print("\ndivisible by 5 :");
            for (l = 1; l <= 100; l++) {
                if (l % 5 == 0) {
                    System.out.print(l + ", ");
                }
            }

        int m;
        System.out.print("\ndivisible by 3 :");
        for (m = 1; m <= 100; m++) {
            if (m % 3 == 0) {
                System.out.print(m + ", ");
            }
        }


        }
    }
