package AdvanceSorting;
import static AdvanceSorting.MergeTwoSortedArrays.print;
public class MergeSortDescending
{
    static void mergeArrayDescending(int[] nums1, int[] nums2, int[] merged) {
        int i = 0, j = 0, k = 0, m = nums1.length, n = nums2.length;
        while (i < m && j < n) {
            if (nums1[i] >= nums2[j])      //Only change was required here
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }
        while (i < m)
            merged[k++] = nums1[i++];
        while (j < n)
            merged[k++] = nums2[j++];
    }
    public static void mergesortdesc(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //create two arrays of n/2 and n-n/2 size
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //copy-pasting
        for (int i = 0; i < n/2; i++) a[i] = arr[i];
        for (int i = 0; i < n-n/2; i++) b[i] = arr[i+n/2];
        //magic
        mergesortdesc(a);
        mergesortdesc(b);
        //merge these 'a' and 'b'
        mergeArrayDescending(a,b,arr);
        // delete 'a' and 'b' (to improve space complexity)
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {10,56,28,65,74,951,2,35,65,7,9,1,2,22,3,67};
        print(arr);
        mergesortdesc(arr);
        print(arr);
    }
}
