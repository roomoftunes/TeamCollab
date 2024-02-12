package Week2_ahmet;

public class Print_Consecutive_Numbers {

    public static void main(String[] args) {
        consecutiveNumbers(30);

    }

        public static void consecutiveNumbers(int n){

            if (n<=0){
                throw new RuntimeException("Number has to be positive");
            }

            for(int i = 1; i <= n; i++){
                String res = "";

                if(i % 2 == 0){
                    res += "Codility";
                }

                if(i % 3 == 0){
                    res += "Test";
                }

                if(i % 5 == 0){
                    res += "Coders";
                }

                System.out.println(res.isEmpty() ? i : res);
            }

        }


    }

/*
        Consecutive Numbers

        Create a method to print consecutive numbers from 1 to N, each on a separate line.
        However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
        Test or Coders respectively. If a number is divisible by more than one of the numbers
        it should be replaced by a concatenation of the respective words.
        The given N value will be a positive integer.

            parameter: int
            return: void

        Example of a number being divisible by 2 & 3:
            when the number is 6 the output should be CodilityTest because 6 is divisible by 2 and 3

        Example of a number being divisible by 2 & 5:
            when the number is 10 the output should be Codi1ityCoders because 10 is divisible by 2 and 5

        Ex:
            input: 16
            output:
                1
                Codility
                Test
                Codility
                Coders
                CodilityTest
                7
                Codility
                Test
                CodilityCoders
                11
                CodilityTest
                13
                Codility
                TestCoders
                Codility
     */



