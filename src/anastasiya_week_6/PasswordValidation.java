package anastasiya_week_6;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your password");
        String pw = in.nextLine();
        System.out.println("is the password valid?");
        System.out.println(passwordValidation(pw));
    }
    public static boolean passwordValidation (String pw){
        boolean containsUpper = false;
        boolean containsLower = false;
        boolean containsSpecial = false;
        boolean containsDigit = false;
        boolean containsSpace = false;
        for (int i = 0; i<pw.length(); i++){
           if (Character.isDigit(pw.charAt(i))){containsDigit = true;}
           else if (Character.isUpperCase(pw.charAt(i))){containsUpper = true;}
           else if (Character.isLowerCase(pw.charAt(i))){containsLower = true;}
           else if (pw.charAt(i) == ' '){containsSpace = true;}
           else {containsSpecial = true;}
        }
        if (pw.length()>=6 && containsDigit && containsLower && containsSpecial && containsUpper && !containsSpace){
            return true;
        } else {return false;}
    }
}
