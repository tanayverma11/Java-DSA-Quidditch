package PW.Arrays1D;
import java.util.Scanner;
public class missingPositiveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        missingPositiveEle obj = new missingPositiveEle();
        System.out.println("The smallest missing positive element is: " +
                                obj.findMissing(arr,n));
    }
        int findMissing(int[] a, int l) {
            int i=0;
            for ( i = 0; i < l; i++)
                if(a[i] > 0) {
                    if (a[i] + 1 != a[i + 1])
                        break;
                }
            return a[i]+1;
        }
}
