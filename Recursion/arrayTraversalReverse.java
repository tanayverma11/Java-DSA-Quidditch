package PW.recursion;
public class arrayTraversalReverse {
    public static void printArray(int idx, int[] arr){
        if(idx==-1) return;
        System.out.print(arr[idx]+ " ");
        printArray(idx-1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        printArray(arr.length-1, arr);
    }
}
