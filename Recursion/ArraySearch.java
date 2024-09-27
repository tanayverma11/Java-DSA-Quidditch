package Recursion;
import java.util.Scanner;
public class ArraySearch {
    public static void searchArray(int idx, int[] arr, int x){
        if(idx==arr.length) {
            System.out.println("-1");
            return;
        }
        if(arr[idx]==x) {
            System.out.println(idx);
            return;
        }
        searchArray(idx+1, arr,x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println("Enter Element to search: ");
        int x=sc.nextInt();
        searchArray(0, arr,x);
        sc.close();
    }
}
