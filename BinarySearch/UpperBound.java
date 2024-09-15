package BinarySearch;
public class UpperBound { // arr[idx] > x
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int n = arr.length;
        int ub = n;
        int lo = 0, hi = n-1;
        int target = 46;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid] > target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(ub);
    }
}
