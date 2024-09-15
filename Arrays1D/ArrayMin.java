package Arrays1D;
import java.util.Scanner;
public class ArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //smallest element calculation
        int min = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] < min)
                min = arr[i];
        System.out.println("Minimum element is: " + min);
        sc.close();
    }
}
