package PW.Arrays2D;
import java.util.Scanner;
public class waveformPrintRows {
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
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMat(arr);
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            if (i % 2 != 0) {
                for (int j = n-1; j >= 0 ; j--)
                     System.out.print(arr[i][j] + " ");
                }
            else {
                for (int j = 0; j < n; j++)
                    System.out.print(arr[i][j] + " ");
            }
        }
    }
}
