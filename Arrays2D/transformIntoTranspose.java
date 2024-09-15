package PW.Arrays2D;
import java.util.Scanner;
public class transformIntoTranspose {
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
        int[][] a = {{10, 20, 30}, {11, 22, 33}, {12, 24, 36}};
        printMat(a);
        //transposing
        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j < i ; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        printMat(a);
    }
}
