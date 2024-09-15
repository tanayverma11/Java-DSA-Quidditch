package Arrays1D;
import java.util.Scanner;
public class ManipulateArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i=0; i<n; i++) {
            if(i%2==0 || i==0)
                arr[i]+=10;
            else
                arr[i]*=2;
        }
        System.out.print("The array after manipulation: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
