package PW.AdvanceSorting;
import java.util.Scanner;
import static PW.AdvanceSorting.MergeTwoSortedArrays.print;
public class Kth_SmallestElement_QuickSelect {
    static int ans;
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
    public static void quickSort(int[] arr, int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) {
                ans=arr[lo];
                return;
            }
        }
        int idx = partition(arr,lo,hi);
        if(idx==k-1){
            ans=arr[idx];
            return;
        }
        if(k-1 < idx) quickSort(arr,lo,idx-1, k);
        else quickSort(arr, idx+1, hi, k);
    }
    public static void main(String[] args) {
        int[] arr = {85,5,69,9,7,4,3,0};
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n = arr.length;
        ans=-1;
        print(arr);
        //quickSort(arr,0,n-1,k);
        quickSort(arr,0,n-1,n-k+1); //Kth Largest Element
        System.out.println(ans);
    }
}
