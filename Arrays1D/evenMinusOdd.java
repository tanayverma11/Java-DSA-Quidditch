package PW.Arrays1D;
import java.util.Scanner;
public class evenMinusOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int evensum=0, oddsum=0;
        for (int i=0; i<n; i++) {
            if(i%2==0 || i==0)
                evensum+=arr[i];
            else
                oddsum+=arr[i];
        }
        System.out.println("Difference b/w sum of elements at even indices and " +
                            "sum of elements at odd indices is: " + (evensum-oddsum));
        sc.close();
    }
}
