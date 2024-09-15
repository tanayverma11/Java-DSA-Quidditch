package PW.Arrays2D;
import java.util.Scanner;
public class addTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1,2,3},{3,-4,5},{-6,7,9}};
        int[][] b = {{10,20,30},{40,50,60},{70,80,90}};
        int m=a.length;
        int n=a[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
