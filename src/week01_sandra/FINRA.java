package week01_sandra;

public class FINRA {

    public static void printFINRA(){

        for (int i = 1; i <=30 ; i++) {

          if(i % 15 == 0){
              System.out.println("FINRA");
          }else if(i % 3 == 0){
              System.out.println("FIN");
          }else if(i % 5 == 0){
              System.out.println("RA");
          }else{
              System.out.println(i);
          }
        }
    }
}