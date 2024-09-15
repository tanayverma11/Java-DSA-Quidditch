package PW.BasicSorting;
public class selectionSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,67,89,90,45,65,76,23,13};
        int n=arr.length;
        //printing
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Selection Sort
        for (int i = 0; i <n-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    minIdx=j;

                }
            }
            swap(arr,i,minIdx);
        }
        //printing after sorting
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
