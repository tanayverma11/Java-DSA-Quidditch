package BinarySearch;
public class RowWithMaxOnes {

    private static int bSearchToCountOnes(int []arr, int n, int target) {
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
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        int no_of_rows = arr.length;
        int[] cnt= new int[no_of_rows];
        int res=-1;
        for (int i = 0; i < no_of_rows; i++) {
            cnt[i] = bSearchToCountOnes(arr[i], arr[i].length, 1);
            if(cnt[i]>res)
                res=i;
        }
        System.out.println(res);
    }
}
