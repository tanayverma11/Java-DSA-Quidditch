package BinarySearch;
import java.util.Scanner;
public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,9,11,12,23,25,28,30,38,45,59,62,68,70};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int lo=0, hi=1;
        boolean flag=false;
        while(arr[hi]<x){
            lo=hi;
            hi=hi*2;
            flag= bSearchInfiniteArray(arr,lo,hi,x);
        }
        if(flag)  System.out.println("Target Element Found");
        else System.out.println("Target Element Not Found");
    }
    public static boolean bSearchInfiniteArray(int[] arr, int lo, int hi, int target){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target) hi=mid-1;
            else if (arr[mid] < target) lo=mid+1;
        }
        return false;
    }
}
