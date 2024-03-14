package kelley_week6;

public class Kelley_FindMaxInArray {

    public static void main(String[] args) {

        int[] intArr1 = {1, 4, 7, 9, 90};
        System.out.println(findMax(intArr1));

        int[] intArr2 = {85, 2, 100, -500, 32};
        System.out.println(findMax(intArr2));

    }

    public static int findMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
