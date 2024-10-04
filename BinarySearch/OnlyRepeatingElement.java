package BinarySearch;
public class OnlyRepeatingElement {

    private static void bSearchOnlyRepeatingElement(int[] arr, int n) {
        int lo = 0, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == arr[mid-1] || arr[mid] == arr[mid+1]) {
                System.out.println(arr[mid]);
                break;
            }
            else if (arr[mid] == mid) hi = mid - 1;
            else lo = mid + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6};
        int n= arr.length;
        bSearchOnlyRepeatingElement(arr,n);
    }
}
