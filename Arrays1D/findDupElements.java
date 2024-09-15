package PW.Arrays1D;
import java.util.Scanner;
public class findDupElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        //finding duplicate elements and displaying
        for(int i=0; i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
        sc.close();
    }
}
