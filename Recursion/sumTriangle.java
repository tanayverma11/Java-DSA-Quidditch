package PW.recursion;

import java.util.Scanner;

public class sumTriangle {
    public static void generateSumTriangle(int []arr){

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
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


    }
}
