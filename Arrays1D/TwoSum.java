package Arrays1D;
import java.util.Scanner;
public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the value of 2-SUM: ");
        int x=sc.nextInt();
    // Two Sum calculation
        System.out.println("Possible combinations of 2-SUM are: ");
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==x)
                    System.out.print("["+arr[i]+","+arr[j]+"]\t");
            }
        }
        sc.close();
    }
}
