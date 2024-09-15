package BinarySearch;
import java.util.Scanner;
public class PerfectSq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. to check for Perfect Square:");
        int n=sc.nextInt();
        bSearchPerfectSq(n);
    }
    public static void bSearchPerfectSq(int n) {
        long lo = 0, hi = n;
        boolean flag = false; //by default let element be NOT present
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid*mid == (long)n) {
                flag = true;
                break;
            } else if (mid*mid > (long)n) hi = mid - 1;
            else  lo = mid + 1;
        }
        if (flag) System.out.println("yes");
        else System.out.println("no");
    }
}