package PW.sorting;
public class insertionSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,67,89,0,-45,65,76,23,-13};
        int n=arr.length;
        //printing
        for (int i = 0; i <n-1 ; i++) System.out.print(arr[i]+" ");
        System.out.println();
        //Insertion Sort
//        for (int i = 1; i < n; i++)
//            for (int j = i; j >= 1 && arr[j]<arr[j-1]; j--) swap(arr,j,j-1);

        // n-1 passes
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j >= 1 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        //printing after sorting
        for (int i = 0; i <n-1 ; i++) System.out.print(arr[i]+" ");
    }
}
