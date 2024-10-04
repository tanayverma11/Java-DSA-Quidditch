package BinarySearch;

public class TotalNosOfOnes {

    private static void bSearchToCountOnes(int []arr, int n, int target) {
        int lo = 0, hi = n - 1, mid = 0, count=0;
        if(arr[lo]==target) count = n;
        else {
            while (lo <= hi) {
                mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) hi = mid - 1;
                else lo = mid + 1;
            }
           count = n-lo;
        }
        System.out.println("No. of Ones are: " + count);
    }

    public static void main(String[] args) {
        int []arr = {0,0,0,1,1};
        int n = arr.length;
        bSearchToCountOnes(arr,n,1);
    }
}
