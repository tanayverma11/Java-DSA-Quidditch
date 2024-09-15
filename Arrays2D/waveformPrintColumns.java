package PW.Arrays2D;

import java.util.Scanner;

public class waveformPrintColumns {
    public static void printMat(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMat(arr);
        int m = arr.length, n = arr[0].length;
        for (int j = 0; j < n ; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < m; i++)
                    System.out.print(arr[i][j] + " ");
            }
            else {
                for (int i = m-1; i >= 0 ; i--)
                    System.out.print(arr[i][j] + " ");
            }
        }
    }
}
