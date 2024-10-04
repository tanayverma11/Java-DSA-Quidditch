package Arrays2D;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of array:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //Find Max & Sum
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum+=arr[i][j];
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println("Maximum element is: "+max);
        System.out.println("Sum of array is: "+sum);
        sc.close();
    }
}
