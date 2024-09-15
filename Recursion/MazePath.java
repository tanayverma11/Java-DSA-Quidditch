package Recursion;
import java.util.Scanner;
public class MazePath {
    public static int maze1(int curr_row, int curr_col, int m, int n){
        if(curr_row==m || curr_col==n) return 1;
        int Rways = maze1(curr_row, curr_col+1, m, n);
        int Dways = maze1(curr_row+1, curr_col, m, n);
        return Rways + Dways;
    }
    public static int maze2(int m, int n){
        return (m==1 || n==1) ? 1 : maze2(m, n-1) + maze2(m-1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int n=sc.nextInt();
      //  System.out.println(maze1(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
