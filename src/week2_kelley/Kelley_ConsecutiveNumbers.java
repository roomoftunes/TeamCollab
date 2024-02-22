package week2_kelley;

public class Kelley_ConsecutiveNumbers {

    public static void main(String[] args) {
        codility(24);
    }

    public static void codility(int N){

        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0){
                result += "Codility";
            }

            if(i % 3 == 0){
                result += "Test";
            }

            if(i % 5 == 0){
                result += "Coders";
            }

            if(result.isEmpty()){
                result += "" + i;
            }
            System.out.println(result);
        }



    }
}
