package Recursion;
import java.util.Scanner;
public class SumTriangle {
    public static void generateSumTriangle(int []arr){
        if(arr.length == 0) return;
        print(arr);
        generateSumTriangle(generateNewLevel(arr));
    }
    public static int[] generateNewLevel(int[] arr){
        int[] newLevel = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newLevel[i] = arr[i] + arr[i + 1];
        }
        return newLevel;
    }
    public static void print(int[] arr){
        System.out.print("[ ");
        for (int j : arr) System.out.print(j + " ");
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        generateSumTriangle(arr);
        sc.close();
    }
}
