package Tasks1;

import java.util.Scanner;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number that you would like to divide");
        String n1 = in.nextLine();
        System.out.println("Enter number by which you would like to divide");
        String n2 = in.nextLine();
        double num1 =Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        divideWithoutDivisionOperator(num1, num2);
    }

    public static void divideWithoutDivisionOperator (double n1, double n2){
        int result = 0;
        if (n2 == 0){
            throw new RuntimeException("You cannot divide by 0");
        }
        for (double i = n2; i<=n1; i+=n2) {
            result++;
        }
        System.out.println("Integer result of division of "+n1+" by "+n2+" is "+result);
    }

}
