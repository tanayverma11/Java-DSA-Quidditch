package PW.Arrays2D;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2, 3}, {10,20,30}};
        //original matrix
        int m = a.length;
        int n = a[0].length;
        System.out.println("Original Matrix is: ");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }

        int[][] trnsps=new int[n][m];
        //transposed matrix
        System.out.println("Transposed Matrix is: ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                trnsps[i][j] = a[j][i];
                System.out.print(trnsps[i][j]+" ");
            }
            System.out.println();
        }
    }
}
