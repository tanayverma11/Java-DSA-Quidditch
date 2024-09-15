package Arrays1D;
import java.util.Scanner;
public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays1D.PalindromeArray obj=new Arrays1D.PalindromeArray();
        if (obj.isPali(arr,n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    boolean isPali(int[] a, int l) {
        for (int i = 0, j = l - 1; i <= l / 2 && j >= l / 2; i++, j--) {
            if (a[i] != a[j])
                return false;
        }
        return true;
    }
}
