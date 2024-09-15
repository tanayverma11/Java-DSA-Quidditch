package Arrays1D;
import java.util.Scanner;
public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        //product calculation
        int product=1;
        for(int i=0; i<n; i++)
            product=product*arr[i];
        System.out.println("Product of the array is: "+product);
        sc.close();
    }
}
