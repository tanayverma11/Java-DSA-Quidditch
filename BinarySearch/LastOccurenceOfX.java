package BinarySearch;
import java.util.Scanner;
public class LastOccurenceOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter target element:");
        int x=sc.nextInt();
        bSearch(arr,n,x);
    }
    public static void bSearch(int []arr,int n, int target) {
        int lo = 0, hi = n - 1, mid = 0;
        boolean flag = false;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                flag = true;
                // break;
                lo = mid + 1;

            }
            else if (arr[mid] > target) hi = mid - 1;
            else if (arr[mid] < target) lo = mid + 1;
        }
        if (flag) System.out.println(mid);
        else System.out.println("-1");
    }
}
