package Arrays1D;
import java.util.Scanner;
public class CountEleGreaterX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter value of 'x':");
        int x = sc.nextInt();
        CountEleGreaterX obj = new CountEleGreaterX();
        obj.greaterThanX(arr,n,x);
    }
    void greaterThanX(int[] a, int l, int x) {
        int count=0;
        for (int i = 0; i < l; i++){
            if (a[i]>x) {
              //  System.out.print(a[i] + " ");
                ++count;
            }
        }
        System.out.println("There are "+count+ " elements greater than "+x);
    }
}
