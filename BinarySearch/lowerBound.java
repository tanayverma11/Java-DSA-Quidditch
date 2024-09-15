package PW.BinarySearch;
public class lowerBound {     // arr[idx] >= x
    public static void main(String[] args) {
        int[] arr = {1,4,5,66,96,96,252,256,368,368,1021};
        int n = arr.length;
        int lb = n;
        int lo = 0, hi = n-1;
        int target = 50;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid] >= target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}
