package AdvanceSorting;
import static AdvanceSorting.MergeTwoSortedArrays.mergeArray;
import static AdvanceSorting.MergeTwoSortedArrays.print;
public class MergeSort {
    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //create two arrays of n/2 and n-n/2 size
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //copy-pasting
        for (int i = 0; i < n/2; i++) a[i] = arr[i];
        for (int i = 0; i < n-n/2; i++) b[i] = arr[i+n/2];
        //magic
        mergesort(a);
        mergesort(b);
        //merge these 'a' and 'b'
        mergeArray(a,b,arr);
        // delete 'a' and 'b' (to improve space complexity)
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {10,56,28,65,74,951,2,35,65,7,9,1,2,22,3,67};
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
