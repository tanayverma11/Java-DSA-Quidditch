package AdvanceSorting;
import static AdvanceSorting.MergeTwoSortedArrays.mergeArray;
import static AdvanceSorting.MergeTwoSortedArrays.print;
public class InversionCount {
    static int count = 0;
    public static void inversion(int[] a, int[] b){
        int i = 0, j = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += (a.length-i);
                j++;
            }
            else i++;
        }
    }
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
        //count inversions
        inversion(a,b);
        //merge these 'a' and 'b'
        mergeArray(a,b,arr);
        // delete 'a' and 'b' (to improve space complexity)
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
