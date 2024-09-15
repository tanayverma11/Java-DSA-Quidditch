package BasicSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,67,89,90,45,65,76,23,13};
        int n=arr.length;
        //printing
        for (int i = 0; i <n-1 ; i++) System.out.print(arr[i]+" ");
        System.out.println();
        //Bubble Sort  (descending order)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //printing after sorting
        for (int i = 0; i <n-1 ; i++) System.out.print(arr[i]+" ");

    }
}
