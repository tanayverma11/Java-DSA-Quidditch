package BinarySearch;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,4,5,66,96,123,252,256,368,900,1021};
        int n = arr.length;
        int lo = 0, hi = n-1;
        System.out.println("Enter element to search for: ");
        int target=sc.nextInt();
        boolean flag=false; //by default let element be NOT present
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            else if (arr[mid] > target) hi=mid-1;
            else if (arr[mid] < target) lo=mid+1;
        }
        if(flag) System.out.println("Target Element Found");
        else System.out.println("Target Element NOT Found");
    }
}
