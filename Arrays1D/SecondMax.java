package Arrays1D;
import java.util.Scanner;
public class SecondMax {
        //second largest element calculation
       private int findSecondLargest(int[] arr, int n){
            int smax = Integer.MIN_VALUE;
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    smax = max;
                    max = arr[i];
                }
                else if (arr[i] < max && arr[i] > smax)
                    smax = arr[i];
            }
            return smax;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        SecondMax obj=new SecondMax();
        System.out.println("Second largest element is: " + obj.findSecondLargest(arr,n));
        sc.close();
    }
}

