package kelley_week2;

public class Kelley_Divisible {

    public static void main(String[] args) {

        String by15 = "Divisible By 15: ";
        String by5 = "Divisible By 5: ";
        String by3 = "Divisible By 3: ";

        for (int i = 1; i <= 100 ; i++) {

            if(i % 15 == 0){
                by15 += i + " ";
            }else if (i % 5 == 0){
                by5 += i + " ";
            }else if (i % 3 == 0){
                by3 += i + " ";
            }
        }

        System.out.println(by15);
        System.out.println(by5);
        System.out.println(by3);
    }
}
