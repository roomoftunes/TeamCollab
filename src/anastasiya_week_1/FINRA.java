package anastasiya_week_1;

public class FINRA {
    public static void main(String[] args) {
        int num = 30;
        finra(num);
    }
    public static void finra(int num){
        for (int i = 1; i <=num; i++) {
            String r;
            if (i%5==0&&i%3==0){
                r = "FINRA";
            } else if (i%5==0){
                r = "RA";
            } else if (i%3==0){
                r = "FIN";
            } else {r=String.valueOf(i);}
            System.out.print(r+" ");
        }
    }
}
