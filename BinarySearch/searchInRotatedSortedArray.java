package PW.BinarySearch;
public class searchInRotatedSortedArray {
 public static int search(int[] arr, int target) {
     int n = arr.length;
     int lo = 0, hi = n-1;
     while(lo<=hi){
         int mid = lo + (hi-lo)/2;
         if(arr[mid] == target) return mid; // target found at mid
         else if(arr[mid] <= arr[hi]) { // in right sorted array, so check for target from arr[mid] -> arr[hi]
             if(target > arr[mid] && target <= arr[hi]) lo = mid + 1;
             else hi = mid - 1;
         }
         else { // in left sorted array so check for target from arr[lo] -> arr[mid]
             if(target >= arr[lo] && target < arr[mid]) hi = mid - 1;
             else lo = mid + 1;
         }
     }
     return -1;
 }
 //driver code
    public static void main(String[] args) {
        int[] a = {7,8,9,0,1,2,3,4,5,6};
        int[] b = {2,5,6,0,0,1,2};
        int x = 8;
        System.out.println(search(b,x));
    }
}
