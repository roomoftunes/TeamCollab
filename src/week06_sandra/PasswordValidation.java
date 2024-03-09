package week06_sandra;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(isValidPassword("Le.j1?><"));
    }

    public static boolean isValidPassword(String password) {

        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialChar = false;
        boolean isDigit = false;

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                isUpperCase = true;
            } else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                isLowerCase = true;
            } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                isSpecialChar = true;
            } else if (Character.isDigit(password.charAt(i))) {
                isDigit = true;
            }
        }
        if(isUpperCase && isLowerCase && isSpecialChar && isDigit){
            return true;
        }
        return false;
    }

}
