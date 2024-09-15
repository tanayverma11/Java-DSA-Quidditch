package AdvanceSorting;
import static AdvanceSorting.MergeTwoSortedArrays.print;
public class AlmostSortedArray {
    public static void main(String[] args) {
        int[] arr={3, 8, 6, 7, 5, 9, 10};
        print(arr);
        int n= arr.length;
        for (int i = n-1; i > 0; i--) {
            if(arr[i]<arr[i-1]){
                int j = i-1;
                while(j >= 0 && arr[i] < arr[j]) j--;
                int temp=arr[i];
                arr[i]=arr[j+1];
                arr[j+1]=temp;
                break;
            }
        }
        print(arr);
    }
}
