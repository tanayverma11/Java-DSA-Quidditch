package Arrays2D;

import java.util.Scanner;

public class RotateMatrix {
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
        int[][] arr = {{10, 20, 30}, {11, 22, 33}, {12, 24, 36}};
        int m=arr.length;
        printMat(arr);
        //transposing
        for (int i = 1; i <m ; i++) {
            for (int j = 0; j < i ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //printMat(arr);
        //rotating    -> reverse each row (after transpose)
        for (int i = 0; i < m; i++) {
            int a=0, b=m-1;
            // swap arr[i][a] & arr[i][b]
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        printMat(arr);
    }
}
