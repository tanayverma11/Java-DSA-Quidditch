package BinarySearch;
import java.util.Scanner;
public class MatrixBS {

        private static boolean bSearchMatrix(int [][]arr, int target) {
            int n = arr.length;
            int m = arr[0].length;
            int row = 0, col = m-1;
            while (row < n && col > -1) {
                int mid = arr[row][col];
                if (mid == target)
                    return true;
                else if (target > mid)
                    row++;
                else
                    col--;
            }
            return false;
        }

    public static void main(String[] args) {
        int [][]arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        boolean flag = bSearchMatrix(arr,x);
        if(flag) System.out.println("TRUE");
        else System.out.println("FALSE");
        sc.close();
    }
}
