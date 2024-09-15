package PW.Arrays1D;
import java.util.Arrays;
import java.util.Scanner;
public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the value of 3-SUM: ");
        int x=sc.nextInt();
        Arrays.sort(arr);
        // Three Sum calculation using 2-pointer approach
        System.out.println("Possible combinations of 3-SUM are: ");
        for (int i=0; i<n; i++){
            int left = i+1;
            int right = n-1;
            while(left < right){
                if((arr[left] + arr[i] + arr[right]) == x) {
                    System.out.print("["+arr[i] + "," + arr[left] + "," + arr[right]+"]\t");
                    left++;
                    right--;
                }
                else if((arr[left] + arr[i] + arr[right]) < x)
                    left++;
                else
                    right--;
            }

        }
    }
}
