package BinarySearch;
import java.util.Scanner;
public class StairCaseOfCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of coins:");
        int n=sc.nextInt();
        bSearchStairCaseOfCoins(n);
    }
    public static void bSearchStairCaseOfCoins(int n) {
        int lo = 0, hi = n-1, mid = 0;
        boolean flag = false;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            int sum = (mid*(mid+1))/2;
            if(sum == n) {
                flag = true;
                break;
            } else if (sum > n) hi = mid - 1;
            else  lo = mid + 1;
        }
        if (flag) System.out.println("No. of complete rows = " + mid);
        else System.out.println("No. of complete rows = " + (mid-1));
    }
}
