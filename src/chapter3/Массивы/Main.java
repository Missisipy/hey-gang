package chapter3.Массивы;

public class Main {
    public static void main(String[] args){
        int[] month_days = {31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31};
        System.out.println( "B апреле " + month_days [3] + " дней." + "\n");

        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0; int i;

        for (i = 0; i < nums.length; i++) result += nums[i];
            System.out.println("Среднее значение: " + result/nums.length);

        int [][] twoD = new int [4][];
        twoD[0] = new int [1];
        twoD[1] = new int [2];
        twoD[2] = new int [3];
        twoD[3] = new int [4];

        System.out.println();

        int in, j, k = 0;

        for (in = 0; in < 4; in++){
            for (j = 0; j < in + 1; j++){
                twoD[in][j] = k;
                k++;
            }
        }

        for (in = 0; in < 4; in++){
            for (j = 0; j < in + 1; j++) System.out.print(twoD[in][j] + " ");
            System.out.println();
        }

        var avg = 10.0;
        int var = 1;
        var myArray = new int[10];
    }
}
