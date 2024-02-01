package week1_ahmet;

public class G9_Finra {
  public static void main(String[] args) {
    int num = 30;
    finra(num);  // calling the finra method.
  }

  public static void finra(int num) {  // create a Finra method


    for (int i = 1; i <= num; i++) {  // create a for  to loop through the numbers from 1 to num.
      if (i % 15 == 0) {
        System.out.println("FINRA");
      } else if (i % 5 == 0) {
        System.out.println("RA");
      } else if (i % 3 == 0) {
        System.out.println("FIN");
      } else {
        System.out.println(i);
      }
    }

  }
}













/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
