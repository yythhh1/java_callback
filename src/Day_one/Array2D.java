package Day_one;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr2d = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
       //System.out.println(Arrays.deepToString(arr2d));
        /*for(int[] arr : arr2d){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }*/
        double[] scores = new double[n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j <m;j++){
                scores[i] += arr2d[i][j];
            }
        }
        for(double score : scores){
            System.out.printf("%.2f ",score / m);
        }
    }
}
