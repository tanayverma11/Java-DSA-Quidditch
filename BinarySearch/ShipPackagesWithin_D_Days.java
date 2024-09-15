package PW.BinarySearch;
import java.util.Scanner;
public class ShipPackagesWithin_D_Days {
    public static int shipWithinDays(int arr[], int d){
        int n= arr.length;
        int sum = 0, mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(arr[i],mx);
            sum += arr[i];
        }
        int lo = mx, hi = sum, minC = sum;
        while(lo<=hi){               //T.C. = O(n*log(sum-mx))
            int mid = lo+(hi-lo)/2;
            if(isPossible(mid, arr, d)){
                minC = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return minC;
    }
    public static boolean isPossible(int c, int arr[], int d){
        int n = arr.length;
        int load = 0;
        int days_taken = 1;
        for (int i = 0; i < n; i++) {
            if(load+arr[i] <= c) load += arr[i];
            else{
                load = arr[i];
                days_taken++;
            }
        }
        if(days_taken > d) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr={3,2,2,4,1,4};
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println(shipWithinDays(arr,d));
    }

}
