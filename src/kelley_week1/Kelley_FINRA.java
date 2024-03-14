package kelley_week1;

public class Kelley_FINRA {

    public static void FINRA(){

        for (int i = 1; i <=30; i++) {

            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FINRA");

            }else if(i % 5 == 0){
                System.out.println("RA");

            }else if(i % 3 == 0){
                System.out.println("FIN");
            }else{
                System.out.println(i);
            }
        }
    }
}
