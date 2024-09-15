package PW.AdvanceSorting;
import static PW.AdvanceSorting.MergeTwoSortedArrays.print;
public class RandomizedQuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi) {
        int mid = (lo+hi)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCnt = 0;
        for (int i = lo ; i <= hi ; i++) {
            if(i == mid) continue;
            if(arr[i] <= pivot) smallerCnt++;
        }
        int correctIdx = lo + smallerCnt;
        //swap( arr[pivotIdx], arr[correctIdx] )
        swap(arr, pivotIdx, correctIdx);
        //partition
        int i = lo, j = hi;
        while( i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        //place the pivot (arr[lo]) at correct position
        // & left part should have ele <= pivot(arr[lo])
        int idx = partition(arr,lo,hi);
        //magic
        quickSort(arr,lo,idx-1);
        quickSort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);
    }
}
