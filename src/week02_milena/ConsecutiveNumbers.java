package week02_milena;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        int num = 17;

        for (int i = 1; i <= num; i++) {
            String result = "";

            if (i % 2 == 0){
                result += "Codility";

            }
            if (i % 3 == 0){
                result += "Test";

            }
            if (i % 5 == 0){
                result += "Coders";

            }

            System.out.println(result.isEmpty() ? i : result);




        }
    }
}
